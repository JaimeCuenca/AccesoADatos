import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HashSets {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("amarillo");
		hs.add("rojo");
		hs.add("amarillo");
		hs.add("negro");
		hs.add("amarillo");
		hs.add("rojo");
		
		System.out.println("El tamaño es: "+ hs.size());
		imprimirList(hs);
		System.out.println();
		imprimirColeccion(hs);
		
	}

	//imprimir hashset
	
	public static void imprimirColeccion(Collection coleccion) {
		
		
		Iterator obj = coleccion.iterator();
		boolean fin = false;

		do {
			try{
				System.out.printf(obj.next()+" ");
			}catch(NoSuchElementException e){
				fin = true;
			}catch(Exception e) {
				System.out.println("Error desconocido");
				e.getMessage();
				fin = true;
			}
		}while(!fin);
	}	
	
	
	//carga en un arraylist e imprimirlo
	
	public static void imprimirList(HashSet lista1) {
		ArrayList lista = new ArrayList();
		lista.addAll(lista1);
		
		imprimirColeccion(lista1);
	}	
	
}
