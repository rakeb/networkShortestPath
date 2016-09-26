package com.sdn.graph;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "C:\\Users\\Md Mazharul Islam\\IdeaProjects\\networkshortestpath\\resources\\network.txt";
        List<Node> adjGraph, path;
        Graph graph = new Graph();
        adjGraph = graph.generateAdjListGraph(file);
        graph.printGraph(adjGraph);
        Bfs bfs = new Bfs();
        Node source = graph.getNode(0);
        Node dest = graph.getNode(4);
        path = bfs.findShortestPath(adjGraph, source, dest);
        bfs.printPath(path);
    }
}
