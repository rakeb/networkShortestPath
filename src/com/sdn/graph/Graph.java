package com.sdn.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class Graph {
    List<Node> listOfNode;

    List<Node> generateAdjListGraph(String filePath){
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        listOfNode = new ArrayList<Node>();

        int sourceNodeId;
        int sourcePort;
        int destNodeId;
        int destPort;
        NodePortPair sourceNodePortPair, destNodePortPair;
        Node sourceNode = null, destNode = null;

        while (sc.hasNext()) {
            sourceNodeId = sc.nextInt();
            sourcePort = sc.nextInt();
            destNodeId = sc.nextInt();
            destPort = sc.nextInt();

            if (ifNodeNotExist(sourceNodeId)) {
                sourceNode = new Node(sourceNodeId);
                listOfNode.add(sourceNode);
            }

            if (ifNodeNotExist(destNodeId)) {
                destNode = new Node(destNodeId);
                listOfNode.add(destNode);
            }


            //create
            sourceNode = getNode(sourceNodeId);
            destNode = getNode(destNodeId);
            sourceNodePortPair = new NodePortPair(destNode, sourcePort, destPort);
            destNodePortPair = new NodePortPair(sourceNode, destPort, sourcePort);

            //i think sourceNode from listOfNode and sourceNode from new works as same. lets try
            sourceNode.insertNodePortPair(sourceNodePortPair);
            destNode.insertNodePortPair(destNodePortPair);
        }
        return this.listOfNode;
    }
//    public Graph(String filePath) {
//        Scanner sc = null;
//        try {
//            sc = new Scanner(new File(filePath));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        listOfNode = new ArrayList<Node>();
//
//        int sourceNodeId;
//        int sourcePort;
//        int destNodeId;
//        int destPort;
//        NodePortPair sourceNodePortPair, destNodePortPair;
//        Node sourceNode = null, destNode = null;
//
//        while (sc.hasNext()) {
//            sourceNodeId = sc.nextInt();
//            sourcePort = sc.nextInt();
//            destNodeId = sc.nextInt();
//            destPort = sc.nextInt();
//
//            if (ifNodeNotExist(sourceNodeId)) {
//                sourceNode = new Node(sourceNodeId);
//                listOfNode.add(sourceNode);
//            }
//
//            if (ifNodeNotExist(destNodeId)) {
//                destNode = new Node(destNodeId);
//                listOfNode.add(destNode);
//            }
//
//
//            //create
//            sourceNode = getNode(sourceNodeId);
//            destNode = getNode(destNodeId);
//            sourceNodePortPair = new NodePortPair(destNode, sourcePort, destPort);
//            destNodePortPair = new NodePortPair(sourceNode, destPort, sourcePort);
//
//            //i think sourceNode from listOfNode and sourceNode from new works as same. lets try
//            sourceNode.insertNodePortPair(sourceNodePortPair);
//            destNode.insertNodePortPair(destNodePortPair);
//        }
//    }

    boolean ifNodeNotExist(int nodeId) {
        for (Node node : listOfNode) {
            if (node.getNodeId() == nodeId)
                return false;
        }
        return true;
    }

    Node getNode(int nodeId) {
        for (Node node : listOfNode) {
            if (node.getNodeId() == nodeId)
                return node;
        }
        return null;
    }

    void printGraph() {
        for (Node node: listOfNode) {
            System.out.print(node.getNodeId() + " --> ");
            for (NodePortPair nodePortPair: node.getNodePortPairList()){
                System.out.print(nodePortPair.node.getNodeId() + "(" +nodePortPair.sourcePort +"." + nodePortPair.destPort+ ") --> ");
            }
            System.out.println("null");
        }
    }
}
