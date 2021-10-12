package model;

public class ArbolNArio<T> {

	private NodoArbolNArio<T> raiz;
	
	public ArbolNArio(){
		raiz = null;
	}
	
	public void insertarElemento(T elementoPadre, T elemento) {
		if(raiz == null) {
			raiz = new NodoArbolNArio<T>(elemento);
		}else {
			
			NodoArbolNArio<T> padreTemp = new NodoArbolNArio<T>(buscar(elementoPadre));
			
			if(padreTemp.getElement() == null) {
				System.out.println("Padre no existe");
			}else {
				padreTemp.insertarElemento(elemento);
			}
		}
	}
	
	public T buscar(T element) {
		if(raiz == null) {
			return null;
		}else {
			return raiz.buscar(element);
		}
	}
	
	public int darPeso() {
		if(raiz == null) {
			return 0;
		}else {
			return raiz.darPeso();
		}
	}
	
	public int darNroHojas() {
		if(raiz == null) {
			return 0;
		}else {
			return raiz.darNroHojas();
		}
	}
	
	public int darAltura() {
		if(raiz == null) {
			return 0;
		}else {
			return raiz.darAltura();
		}
	}
	
	public NodoArbolNArio<T> getRaiz(){
		return raiz;
	}
}
