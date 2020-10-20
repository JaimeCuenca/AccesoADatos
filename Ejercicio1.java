
//atributos 1 estatico (de clase),  constructor no por defecto (o dos), getter y setter, metodo de proceso.
//clase principal con un metodo principal para hacer llamada a la clase y sus metodos.

public class Ejercicio1 {
	
	public static int empleado;
	public int edad;
	public String nombre;
	public String dni;
	public double salario;
	public char dia_libre;
	public boolean jefe;
	
	
	//constructores

	public Ejercicio1(int edad, String nombre, String dni, double salario, char dia_libre, boolean jefe) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
		this.dia_libre = dia_libre;
		this.jefe = jefe;
		setEmpleado();
	}
	
	
	//getter y setter
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char getDia_libre() {
		return dia_libre;
	}

	public void setDia_libre(char dia_libre) {
		this.dia_libre = dia_libre;
	}

	public boolean isJefe() {
		return jefe;
	}

	public void setJefe(boolean jefe) {
		this.jefe = jefe;
	}
	
	
	public static int getEmpleado() {
		return empleado;
	}

	public static void setEmpleado() {
		Ejercicio1.empleado = Ejercicio1.empleado++;
	}

	//toString
	@Override
	public String toString() {
		return "Ejercicio1 [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + ", dia_libre=" + dia_libre
				+ ", jefe=" + jefe + "]";
	}
	
	//Metodo aumento salario
	public void aumentoSalario() {
		this.salario=(this.getSalario()*1.2);
	}
}
