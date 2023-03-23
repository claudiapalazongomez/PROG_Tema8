package es.studium.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura
{

	public static void main(String[] args)
	{
		try {
			// Abrir fichero
			FileWriter fw = new FileWriter("archivo.txt", true); // si no le especificamos la ruta, se guarda en la carpeta del proyecto
			// Si le ponemos true, mantiene la información que ya tenemos anteriormente almacenada en el fichero
			BufferedWriter bw = new BufferedWriter(fw); // para prevenir los problemas de velocidad y no perder información (intermediario)
			PrintWriter salida = new PrintWriter(bw);
			// Trabajar con el fichero
			salida.println("Claudia Palazón"); 
			// Cerrar fichero
			salida.close(); // se cierra en orden inverso a lo que hemos ido abriendo
			bw.close();
			fw.close();
		}
		catch(IOException ioe){
			System.out.println("Error en Fichero");
		}

	}

}
