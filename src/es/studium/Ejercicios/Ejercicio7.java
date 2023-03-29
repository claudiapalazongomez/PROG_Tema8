package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Dame el nombre del fichero origen:");
			String fichero1 = teclado.nextLine();
			System.out.println("Dame el nombre del fichero destino:");
			String fichero2 = teclado.nextLine();
			// Abrir fichero
			FileReader fr = new FileReader(fichero1);
			File fichero = new File(fichero2);
			FileWriter fw2 = null;
			if(fichero.exists()) {
				System.out.println("El fichero destino YA existe.");
				System.out.println("¿Añadir(A) o Sobreescribir(S)?");
				String respuesta = teclado.nextLine();
				if(respuesta.equals("A")) {
					fw2 = new FileWriter(fichero2, true); 
				} else {
					fw2 = new FileWriter(fichero2, false); 
				}
			}
			else {
				fw2 = new FileWriter(fichero2); 
			}
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			PrintWriter pw2 = new PrintWriter(bw2); // para que se sobreescriba
			String linea;
			// Trabajar con el fichero
			while((linea=br.readLine())!=null) { // mientras que haya contenido en el fichero, sigue dando vueltas
				pw2.println(linea);
			}
			System.out.println("Información copiada");
			br.close();
			fr.close();
			bw2.close();
			fw2.close();
			pw2.close();
			teclado.close();
			
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ioe){
			System.out.println("Error en Fichero");
		}
	}

}
