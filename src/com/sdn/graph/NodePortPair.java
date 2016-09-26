package com.sdn.graph;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class NodePortPair {
    private Node node;
    private int sourcePort;
    private int destPort;

    public NodePortPair(Node node, int sourcePort, int destPort) {
        this.node = node;
        this.sourcePort = sourcePort;
        this.destPort = destPort;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(int sourcePort) {
        this.sourcePort = sourcePort;
    }

    public int getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }
}
