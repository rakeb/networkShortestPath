package com.company;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class NodePortPair {
    Node node;
    int sourcePort;
    int destPort;

    public NodePortPair(Node node, int sourcePort, int destPort) {
        this.node = node;
        this.sourcePort = sourcePort;
        this.destPort = destPort;
    }
}
