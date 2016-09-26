package com.sdn.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Md Mazharul Islam on 9/26/2016.
 */
public class Bfs {
    private static int INFINITY = Integer.MAX_VALUE;

    private Queue<Node> queue;
    private Stack<Node> path;

    public Bfs() {
        this.queue = new LinkedList<>();
        path = new Stack<>();
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

    public void printPath(List<Node> path) {
        System.out.println("printing path...");
        PortPair portPair;
        for (int i = path.size(); i > 0; i--) {
            System.out.print(path.get(i - 1).getNodeId() + " --> ");
            if (i - 2 >= 0) {
                portPair = Utilities.getConnectedNodesPortPair(path.get(i - 1), path.get(i - 2));
                System.out.print("(" + portPair.getSourcePort() + "," + portPair.getDestPort() + ") ");
            }
        }
        System.out.println("null");
    }

}
