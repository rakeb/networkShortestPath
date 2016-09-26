package com.sdn.graph;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class NodePortPair {
    private Node node;
    PortPair portPair;

    public NodePortPair(Node node, int sourcePort, int destPort) {
        this.node = node;
        this.portPair = new PortPair(sourcePort, destPort);
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public PortPair getPortPair() {
        return portPair;
    }

    public void setPortPair(PortPair portPair) {
        this.portPair = portPair;
    }
}
