package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio14
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
				FileOutputStream fos = new FileOutputStream("tabla1.dat", true); // se guardan 1 y 0
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataOutputStream salidaB = new DataOutputStream(bos);
				for(int i = 0; i < enteros.length; i++) {
					salidaB.writeInt(enteros[i]);
				}
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
