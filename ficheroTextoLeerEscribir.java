package ejercicio2209;

//clases
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//excepciones
import java.io.IOException;

public class ficheroTextoLeerEscribir {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String cadena="";
		char resp=' ', caracter=' ';
		int finaliza;
		boolean fin=false;
		
		File fichero = new File("fichero.txt");
		FileWriter fichW = new FileWriter(fichero);
		
		
		
		do {
			System.out.println("Escriba en el fichero: ");
			cadena=sc.nextLine();
			fichW.write(cadena);
			fichW.write("\n");
			
			System.out.println("¿Desea continuar escribiendo? (S/N): ");
			resp=sc.nextLine().toUpperCase().charAt(0);
			
		}while(resp=='S');
		
		fichW.close();
		sc.close();
		
		FileReader fichR = new FileReader(fichero);
		do {

			finaliza = fichR.read();
			caracter = (char) finaliza;
			if(finaliza==-1) {
				fin=true;
				System.out.println("[Fin del fichero]");
			}else
				System.out.print(caracter);
		}while(!fin);
		
		fichR.close();
		
	}
}
