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

//    List<BfsNode> listOfBfsNode;
    Queue<Node> queue;

    public Bfs() {
//        this.listOfBfsNode = new ArrayList<>();
        this.queue = new LinkedList<>();
    }

    public void generateShortestPathWithBfs(List<Node> adjListGraph, Node source, Node dest) {
//        convertNodeToBfsNode(adjListGraph);
        BfsNode rootBfsNode = getBfsNode(source.getNodeId());
        BfsNode destBfsNode = getBfsNode(dest.getNodeId());
        rootBfsNode.setDistance(0);
        queue.add(rootBfsNode);

        BfsNode current;
        while (!queue.isEmpty()) {
            current = queue.remove();
            for(BfsNode n : current.getNodePortPairList())
        }
    }

//    private void convertNodeToBfsNode(List<Node> adjListGraph) {
//        for (Node node : adjListGraph) {
//            BfsNode bfsNode =  new BfsNode(node);
//            bfsNode.setDistance(0);
//            bfsNode.setParent(null);
//            this.listOfBfsNode.add(bfsNode);
//        }
//    }

    BfsNode getBfsNode(int nodeId) {
        for (BfsNode bfsNode : listOfBfsNode) {
            if (bfsNode.getNodeId() == nodeId)
                return bfsNode;
        }
        return null;
    }
}
