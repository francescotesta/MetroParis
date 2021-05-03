package it.polito.tdp.metroparis.model;

import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.graph.SimpleGraph;

public class ProvaGrafo {

	public static void main(String[] args) {
		
		Graph<String, DefaultEdge> grafo = new SimpleDirectedGraph<>(DefaultEdge.class);
		
		grafo.addVertex("UNO");
		grafo.addVertex("DUE");
		grafo.addVertex("TRE");
		
		grafo.addEdge("UNO", "DUE");
		grafo.addEdge("TRE", "UNO");
		
		System.out.println(grafo);
	}

}
