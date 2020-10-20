package ejercicio2209;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Principal {

	public static void main(String[] args) {
		
		HashSet <Persona> hs = new HashSet <Persona> ();
		hs.add(new Persona("Jaime", (short) 23));
		hs.add(new Persona("Celeste", (short) 24));
		hs.add(new Persona("Jaime",  (short) 24));
		
		imprimirColeccion(hs);
		
		TreeSet <Persona2> ts = new TreeSet <Persona2> ();
		ts.add(new Persona2("Jaime2", (short) 23));
		ts.add(new Persona2("Jaime2", (short) 24));
		ts.add(new Persona2("Celeste2", (short) 24));
		ts.add(new Persona2("Jaime2", (short) 23));
		
		System.out.println();
		
		imprimirColeccion(ts);
		
	}
public static void imprimirColeccion(Collection coleccion) {
		
		
		Iterator obj = coleccion.iterator();
		boolean fin = false;

		do {
			try{
				System.out.printf(obj.next()+" | ");
			}catch(NoSuchElementException e){
				fin = true;
			}catch(Exception e) {
				System.out.println("Error desconocido");
				e.getMessage();
				fin = true;
			}
		}while(!fin);
	}	
}
