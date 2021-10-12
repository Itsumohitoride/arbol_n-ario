package ui;

import model.ArbolNArio;
import model.NodoArbolNArio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Crear un nuevo arbol n-ario");
		
		NodoArbolNArio<Integer> newInteger = new NodoArbolNArio<Integer>(3);
		
		ArbolNArio<NodoArbolNArio<Integer>> newArbol = new ArbolNArio<NodoArbolNArio<Integer>>();
		
		newArbol.insertarElemento(null, newInteger);
		
		System.out.println(newArbol.buscar(newInteger).toString());
		
		
	}
}
