package es.studium.Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		try {
			// Abrir fichero
			FileWriter fw = new FileWriter("fich1.txt", true); // si no le especificamos la ruta, se guarda en la carpeta del proyecto
			// Si le ponemos true, mantiene la información que ya tenemos anteriormente almacenada en el fichero
			BufferedWriter bw = new BufferedWriter(fw); // para prevenir los problemas de velocidad y no perder información (intermediario)
			PrintWriter salida = new PrintWriter(bw);
			// Trabajar con el fichero
			System.out.println("Escribe una frase:");
			String contenido = teclado.nextLine();
			salida.println(contenido); 
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
