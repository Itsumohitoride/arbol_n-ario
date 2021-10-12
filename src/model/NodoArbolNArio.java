package model;

import java.util.ArrayList;

public class NodoArbolNArio<T> {
	
	private T element;
	private ArrayList<NodoArbolNArio<T>> children;
	
	public NodoArbolNArio(T element) {
		this.element = element;
		children = new ArrayList<NodoArbolNArio<T>>();
	}
	
	public T buscar(T elemento) {
		
		if(element.equals(elemento)) {
			return element;
		}else if(esHoja()) {
			return null;
		}else {
			for (int i = 0; i < children.size(); i++) {
				T temp = children.get(i).buscar(elemento);
				if(temp != null) {
					return temp;
				}
			}
			return null;
		}
	}
	
	public int darPeso() {
		if(esHoja()) {
			return 1;
		}else {
			int pesoAcum = 1;
			
			for (int i = 0; i < children.size(); i++) {
				pesoAcum += children.get(i).darPeso();
			}
			return pesoAcum;
		}
	}
	
	public int darNroHojas() {
		if(esHoja()) {
			return 1;
		}else {
			int numHojas = 0;
			
			for (int i = 0; i < children.size(); i++) {
				numHojas += children.get(i).darNroHojas();
			}
			return numHojas;
		}
	}
	
	public int darAltura() {
		if(esHoja()) {
			return 1;
		}else {
			int maxAltura = 0;
			
			for (int i = 0; i < children.size(); i++) {
				
				NodoArbolNArio<T> hijo = children.get(i);
				int tempAltura = hijo.darAltura();
				if(tempAltura > maxAltura) {
					maxAltura = tempAltura;
				}
			}
			return maxAltura+1;
		}
	}
	
	public void insertarElemento(T elemento) {
		children.add(new NodoArbolNArio<T>(elemento));
	}
	
	public boolean esHoja() {
		return (children.size() == 0);
	}
	
	public T getElement(){
		return element;
	}
	
	public ArrayList<NodoArbolNArio<T>> getChildren(){
		return children;
	}
	
	public String toString() {
		return String.valueOf(element);
	}
}
