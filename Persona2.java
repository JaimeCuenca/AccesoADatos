package ejercicio2209;

import java.util.Objects;

public class Persona2 implements Comparable <Persona2>{
	private String nombre;
	private short edad;
	
	
	public Persona2(String nombre, short edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona2() {
		super();
		this.nombre = " ";
		this.edad = 0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public short getEdad() {
		return edad;
	}


	public void setEdad(short edad) {
		this.edad = edad;
	}


	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + "";
	}

		// COMPARETO (HASHCODE + EQUALS PERO EN OBJETOS)
		
	public int compareTo(Persona2 obj) {
		int result = 0;
			
		result = nombre.compareTo(obj.nombre);
		if (result == 0)
			result = edad-obj.edad;
		return result;
	}
	
}
