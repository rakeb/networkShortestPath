package com.sdn.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Md Mazharul Islam on 9/26/2016.
 */
public class Bfs {
    private static int INFINITY = Integer.MAX_VALUE;

    Queue<Node> queue;
    List<Node> path;

    public Bfs() {
        this.queue = new LinkedList<>();
        this.path = new ArrayList<>();
    }

    public List<Node> findShortestPath(List<Node> adjListGraph, Node root, Node dest) {
        generateShortestPathWithBfs(adjListGraph, root, dest);
        path.add(dest);
        Node goingToAdd = dest.getParent();
        while (goingToAdd != null) {
            path.add(goingToAdd);
            goingToAdd = goingToAdd.getParent();
        }
        return path;
    }

    private void generateShortestPathWithBfs(List<Node> adjListGraph, Node root, Node dest) {
        for (Node node : adjListGraph) {
            node.setDistance(INFINITY);
            node.setParent(null);
        }

        root.setDistance(0);
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            for (NodePortPair nodePortPair : current.getNodePortPairList()) {
                Node n = nodePortPair.getNode();
                if (n.getDistance() == INFINITY) {
                    n.setDistance(current.getDistance() + 1);
                    n.setParent(current);
                    queue.add(n);
                }
                if (n.getNodeId() == dest.getNodeId()) {
                    return;
                }
            }
        }
    }

    public void printPath (List<Node> path) {
        System.out.println("printing path...");
        for (Node node: path) {
            System.out.print(node.getNodeId() + " --> ");
//            for (NodePortPair nodePortPair: node.getNodePortPairList()){
//                System.out.print(nodePortPair.getNode().getNodeId() + "(" +nodePortPair.getSourcePort() +"." + nodePortPair.getDestPort()+ ") --> ");
//            }
//            System.out.println("null");
        }
        System.out.println("null");
    }
}
