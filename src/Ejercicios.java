import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

//Trabaje con Iveth Sabillon
public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try//Se hace un try para poder escribir en el archivo
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
		escritor.write(contenido);//Se escribe la variable en el archivo
		escritor.flush();
		}catch (Exception e)//Se define el catch para asignar un error 
	{
			e.printStackTrace();		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		
		try//Se hace un try para poder escribir en el archivo
		{
		PrintWriter escritor = new PrintWriter(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
		escritor.write(contenido);//Se escribe la variable en el archivo
		escritor.flush();
		}catch (Exception e)
	{
			e.printStackTrace();//Se define el catch para asignar un error
	}
		
	}
		
	
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		FileReader fr = null;// Se hace un FileReader para poder leer la variable dentro del archivo 
		int entero = 0;//Se hace una varible de tipo int
		try//Se hace un try para poder escribir en el archivo
		{
		File archivo = new File(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
		 fr = new FileReader(archivo);
		 entero = fr.read();//Se lee la variable
		
		
		}catch (Exception e)//Se define el catch para asignar un error
	{
			e.printStackTrace();
	}
		return entero;//Devuelve la variable hecha
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		FileReader fr = null;// Se hace un FileReader para poder leer la variable dentro del archivo
		BufferedReader br = null; // Se hace un BufferedReader para poder leer la variable dentro del archivo
		String contenido = null;//Se hace una varible de tipo string
		try//Se hace un try para poder escribir en el archivo
		{
		File archivo = new File(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
		BufferedReader bf = new BufferedReader(fr);
		 fr = new FileReader(archivo);
		 contenido = br.readLine();//Se lee la variable
			
		
		
		}catch (Exception e)//Se define el catch para asignar un error 
	{
			e.printStackTrace();
	}
		return contenido;//Devuelve la variable hecha
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		FileReader fr = null;// Se hace un FileReader para poder leer la variable dentro del archivo
		double entero = 0;//se hace una variable de tipo double
		try//Se hace un try para poder escribir en el archivo
		{
		File archivo = new File(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
		 fr = new FileReader(archivo);
		 entero = fr.read();//Se lee la variable
			
		
		
		}catch (Exception e)//Se define el catch para asignar un error 
	{
			e.printStackTrace();
	}
		return entero;//Devuelve la variable
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
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
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		int menor = 9999;//Se hace una variable de tipo int
		try//Se hace un try para poder escribir en el archivo
		{
			File archivo = new File(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
			Scanner s = new Scanner (archivo);//Se hace un scanner 
			while(s.hasNext())//Aqui con el while se ponen las condiciones para q recorra todo el archivo
			{
				int num = s.nextInt();//el usuario agrega un numero
				if (num < menor)//con un if se evalua si el numero es menor que la variable hecha
					menor=num;//Si el numero es menor,la variable toma el valor de ese numero
				}
			}catch (Exception e)//Se define el catch para asignar un error 
			{
				e.printStackTrace();
			}
		return menor;//Devuelve la variable
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
