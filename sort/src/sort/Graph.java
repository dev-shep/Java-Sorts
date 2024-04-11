package sort;
import java.util.*;

public class Graph {
    private int V; // Número de vértices
    private LinkedList<Integer>[] adj; // Lista de adyacencia

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Método para agregar una arista al grafo
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // Si el grafo es no dirigido
    }

    // Método para imprimir el grafo
    void printGraph() {
        for (int i = 0; i < V; ++i) {
            System.out.println("Lista de adyacencia del vértice " + i);
            System.out.print("head");
            for (Integer integer : adj[i]) {
                System.out.print(" -> " + integer);
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        // Crear un grafo con 5 vértices
        Graph graph = new Graph(5);

        // Agregar aristas
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Imprimir el grafo
        graph.printGraph();
    }
}
