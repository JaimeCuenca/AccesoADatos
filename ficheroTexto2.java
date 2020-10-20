package ejercicio2209;
import java.io.File;
import java.util.Scanner;

//pedir por pantalla una ruta e indicar todos los ficheros y directorios que haya 
//trasladandolos a la segunda ruta


public class ficheroTexto2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ruta1="";
		String ruta2="";
		
		System.out.printf("Introduzca ruta actual: ");
		ruta1 = sc.nextLine();
		System.out.printf("Introduzca ruta nueva: ");
		ruta2 = sc.nextLine();
		
		File fich1 = new File (ruta1);
		File fich2 = new File (ruta2);
		
		
		if(fich1.isDirectory() && fich2.isDirectory()) {
			for (File i : fich1.listFiles()) {
				i.renameTo(new File(fich2.getAbsolutePath()+File.separator+i.getName()));
			}
		}else {
			System.out.println("Introduzca unas rutas de directorios válidas");
		}
	}
}
