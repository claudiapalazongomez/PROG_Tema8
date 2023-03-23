package es.studium.FicherosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroTextoLectura
{

	public static void main(String[] args)
	{
		try {
			// Abrir fichero
			FileReader fr = new FileReader("archivo.txt");
			BufferedReader br = new BufferedReader(fr);
			String contenido; // para guardar el contenido del fichero
			// Trabajar con el fichero
			while((contenido=br.readLine())!=null) { // mientras que haya contenido en el fichero, sigue dando vueltas
				System.out.println(contenido);
			}
			// Cerrar fichero
			br.close();
			fr.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ioe){
			System.out.println("Error en Fichero");
		}
	}

}
