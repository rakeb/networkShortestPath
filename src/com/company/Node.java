package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Md Mazharul Islam on 9/24/2016.
 */
public class Node {
    int nodeId;
    List<NodePortPair> nodePortPairList;

    public Node(int nodeId) {
        this.nodeId = nodeId;
        if (this.nodePortPairList == null) {
            nodePortPairList = new ArrayList<>();
        }
    }

    void insertNodePortPair(NodePortPair nodePortPair) {
        this.nodePortPairList.add(nodePortPair);
    }
}
