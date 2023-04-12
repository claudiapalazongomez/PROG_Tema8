package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int enteros[] = new int[10];
		for(int i = 0; i < enteros.length; i++) {
			System.out.println("Dame un número entero " + (i+1));
			enteros[i] = teclado.nextInt();
		}
		teclado.close();
		try {
			FileOutputStream fos = new FileOutputStream("tabla2.dat", true); // se guardan 1 y 0
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream salidaB = new ObjectOutputStream(bos);
			salidaB.writeObject(enteros);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada con éxito");
		}
		catch(IOException ioe){
			System.out.println("Error en el fichero");
		}
	}

}
