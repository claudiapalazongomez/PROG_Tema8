package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio12
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("uno.bin"); // se guardan 1 y 0
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaB = new DataOutputStream(bos);
			System.out.println("Escribe un número entero:");
			int numero = teclado.nextInt();
			salidaB.writeInt(numero); 
			salidaB.close();
			bos.close();
			fos.close();
			teclado.close();
			System.out.println("Información guardada con éxito");
		}
		catch(IOException ioe){
			System.out.println("Error en el fichero");
		}
	}

}


