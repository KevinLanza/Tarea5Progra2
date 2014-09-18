import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write(contenido);
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		
		try
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write(contenido);
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();		}
		
	}
		
	
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		try
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write("");
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();
	}
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		try
		{
		PrintReader escritor = new PrintWriter(nombre_archivo);
		escritor.();
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();
	}
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		return -1;
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		try
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);
		escritor.write(""
			);
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();
	}
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		int menor = 9999;
		try
		{
			File archivo = new File(nombre_archivo);
			Scanner s = new Scanner (archivo);
			while(s.hasNext())
			{
				int num = s.nextInt();
				if (num < menor)
					menor=num;
				}
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		return menor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
