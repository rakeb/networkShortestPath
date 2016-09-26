package com.sdn.graph;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "C:\\Users\\Md Mazharul Islam\\IdeaProjects\\networkshortestpath\\resources\\network.txt";
        List<Node> adjGraph;
        Graph graph = new Graph();
        adjGraph = graph.generateAdjListGraph(file);
        graph.printGraph();
        Bfs bfs = new Bfs();
        bfs.generateShortestPathWithBfs(adjGraph, null, null);
    }
}
