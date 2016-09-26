package com.sdn.graph;

/**
 * Created by Md Mazharul Islam on 9/26/2016.
 */
public class PortPair {
    private int sourcePort;
    private int destPort;

    public PortPair() {
    }

    public PortPair(int sourcePort, int destPort) {
        this.sourcePort = sourcePort;
        this.destPort = destPort;
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
