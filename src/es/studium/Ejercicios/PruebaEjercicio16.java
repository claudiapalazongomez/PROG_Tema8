package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class PruebaEjercicio16
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int enteros[] = new int[10];
		String nombreFichero = "";
		System.out.println("Nombre del fichero:");
		nombreFichero = teclado.nextLine();
		teclado.close();
		try {
				FileInputStream fis = new FileInputStream(nombreFichero);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream entradaB = new ObjectInputStream(bis); 
				enteros = (int[]) entradaB.readObject();
				entradaB.close();
				bis.close();
				fis.close();
				for(int numero: enteros) {
					System.out.println(numero);
				}
			}
		catch(FileNotFoundException fnfe){
			System.out.println("El fichero no se encuentra");
		}
			catch(IOException ioe){
				System.out.println("Error en el fichero");
			} catch (ClassNotFoundException e)
			{
				System.out.println("Error de casting "+e.getMessage());
				e.printStackTrace();
			}

	}

}

