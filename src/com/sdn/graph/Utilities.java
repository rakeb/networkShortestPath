package com.sdn.graph;

/**
 * Created by Md Mazharul Islam on 9/26/2016.
 */
public class Utilities {

    public static PortPair getConnectedNodesPortPair(Node firstNode, Node secondNode) {
        for (NodePortPair nodePortPair : firstNode.getNodePortPairList()) {
            if (secondNode.getNodeId() == nodePortPair.getNode().getNodeId()) {
                return nodePortPair.getPortPair();
            }
        }
        return null;
    }
}
