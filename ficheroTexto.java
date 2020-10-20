package ejercicio2209;
import java.io.File;
import java.util.Scanner;

//pedir por pantalla una ruta e indicar todos los ficheros y directorios que haya 
//indicando a su lado si es directorio o fichero


public class ficheroTexto {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ruta="";
		
		System.out.printf("Introduzca ruta: ");
		ruta = sc.nextLine();
		
		File fich = new File (ruta);
		
		
		if(fich.isDirectory()) {
			for (File i : fich.listFiles()) {
				if(i.isDirectory()) {
					System.out.println(i.getName()+" [Directorio]");
				}else {
					System.out.println(i.getName()+" [Fichero]");
				}
			}
		}else {
			System.out.println("Introduzca una ruta de directorio válida");
		}
	}
}
