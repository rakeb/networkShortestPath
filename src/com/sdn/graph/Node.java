package com.sdn.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class Node {
    private int nodeId;
    private List<NodePortPair> nodePortPairList;
    private int distance;
    private Node parent;

    public Node() {
    }

    public Node(int nodeId) {
        this.nodeId = nodeId;
        if (this.nodePortPairList == null) {
            nodePortPairList = new ArrayList<>();
        }
    }

    void insertNodePortPair(NodePortPair nodePortPair) {
        this.nodePortPairList.add(nodePortPair);
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public List<NodePortPair> getNodePortPairList() {
        return nodePortPairList;
    }

    public void setNodePortPairList(List<NodePortPair> nodePortPairList) {
        this.nodePortPairList = nodePortPairList;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
