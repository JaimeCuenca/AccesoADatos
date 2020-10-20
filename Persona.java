package ejercicio2209;

import java.util.Objects;

public class Persona {
	private String nombre;
	private short edad;
	
	
	public Persona(String nombre, short edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
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

		//HASHCODE + EQUALS
		
		public int hashCode() {
			return Objects.hash(nombre,edad);
		}
		
		public boolean equals(Object obj) {
			
			if (obj instanceof Persona) {
				if (this == obj) {
						return true;
				} else {
					Persona p = (Persona) obj;
					return nombre.equals(p.nombre) && edad==p.edad;
				}
			}else
				return false;
		}
		
		
	
}
