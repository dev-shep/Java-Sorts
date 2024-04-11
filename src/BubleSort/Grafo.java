package BubleSort;
import java.util.*;

public class Grafo {
	
	 private int V;
	 private LinkedList<Integer> adyacencia[];
	 
	 Grafo(int v){
		 V = v;
		 adyacencia = new LinkedList[v];
		 for (int i = 0; i < v; ++i) {
			adyacencia[i] = new LinkedList();
		}
	 }
	
	 void agregarArista(int v, int w) {
		 adyacencia[v].add(w);
	 }
	 
	 void imprimirGrafo() {
		 for (int i = 0; i < V; ++i) {
			System.out.println("el vertice "+i+" esta conectado a:");
			Iterator<Integer> iterador = adyacencia[i].listIterator();
			while(iterador.hasNext()) {
				int n= iterador.next();
				System.out.print(n+ " ");
			}
			System.out.println();
		}
	 }
	 
     public static void main(String args[]) {
    	 Grafo grafo = new Grafo(2);
    	 
    	 grafo.agregarArista(0, 1);
    	 grafo.agregarArista(1, 2);
    	 
    	 grafo.imprimirGrafo();
     }

	
}
