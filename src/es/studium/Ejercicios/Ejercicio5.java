package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Dame el nombre del primer fichero:");
			String fichero1 = teclado.nextLine();
			System.out.println("Dame el nombre del segundo fichero:");
			String fichero2 = teclado.nextLine();
			// Abrir fichero
			FileReader fr = new FileReader(fichero1);
			FileReader fr2 = new FileReader(fichero2);
			BufferedReader br = new BufferedReader(fr);
			BufferedReader br2 = new BufferedReader(fr2);
			String contenido = ""; 
			String contenido2 = "";
			String linea;
			String linea2;
			// Trabajar con el fichero
			while((linea=br.readLine())!=null) { // mientras que haya contenido en el fichero, sigue dando vueltas
				contenido = contenido + linea;
			}
			while((linea2=br2.readLine())!=null) { // mientras que haya contenido en el fichero, sigue dando vueltas
				contenido2 = contenido2 + linea2;
			}
			br.close();
			fr.close();
			br2.close();
			fr2.close();
			
			if(contenido.equals(contenido2)) {
				System.out.println("Son iguales");
			}else {
				System.out.println("Son distintos");
			}
			
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ioe){
			System.out.println("Error en Fichero");
		}
	}
}
