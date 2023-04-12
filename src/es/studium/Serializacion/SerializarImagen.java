package es.studium.Serializacion;

import java.io.IOException;

public class SerializarImagen
{

	public static void main(String[] args)
	{
		String entrada = "chrisbrown.jpg";
		String salida = "salida.txt";
		
		try {
			String encoded = Base64.encodeFromFile(entrada);
			System.out.println(encoded);
			
			Base64.encodeFileToFile(entrada, salida);
			
			Base64.decodeFileToFile(salida, "salida.jpg");
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
