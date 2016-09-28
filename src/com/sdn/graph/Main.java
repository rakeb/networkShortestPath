package com.sdn.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input;
        try {
            input = new FileInputStream("resources\\config.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sourceNodeId = Integer.parseInt(prop.getProperty("sourceNodeId"));
        int destNodeId = Integer.parseInt(prop.getProperty("destNodeId"));


        String file = "resources\\network.txt";
        List<Node> adjGraph, path;

        Graph graph = new Graph();
        adjGraph = graph.generateAdjListGraph(file);
        graph.printGraph(adjGraph);

        Bfs bfs = new Bfs();
        Node source = graph.getNode(sourceNodeId);
        Node dest = graph.getNode(destNodeId);

        path = bfs.findShortestPath(adjGraph, source, dest);
        bfs.printPath(path);
    }
}
