package es.studium.Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		char contenido;
		try {
			// Abrir fichero
			FileWriter fw = new FileWriter("fich2.txt"); // si no le especificamos la ruta, se guarda en la carpeta del proyecto
			// Si le ponemos true, mantiene la información que ya tenemos anteriormente almacenada en el fichero
			BufferedWriter bw = new BufferedWriter(fw); // para prevenir los problemas de velocidad y no perder información (intermediario)
			PrintWriter salida = new PrintWriter(bw);
			// Trabajar con el fichero
			do {
				System.out.println("Escribe un caracter:");
				contenido = teclado.nextLine().charAt(0);
				if(contenido != '*') {
				salida.println(contenido); 
				}
			} while(contenido!='*');
			System.out.println("Información almacenada");
			// Cerrar fichero
			salida.close(); // se cierra en orden inverso a lo que hemos ido abriendo
			bw.close();
			fw.close();
			teclado.close();
		}
		catch(IOException ioe){
			System.out.println("Error en Fichero");
		}
	}
}
