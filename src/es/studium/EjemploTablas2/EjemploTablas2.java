package es.studium.EjemploTablas2;

import java.util.Scanner;

public class EjemploTablas2 {

	public static void main(String[] args) 
	{
		final int TAM = 10;
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[TAM];
		int i;
		for (i= 0; i<TAM; i++) 
		{
			System.out.println( "escribir el valor de tabla["+i+"]");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		for (i= 0; i<TAM; i++) 
		{
			System.out.println(tabla[i]);
		}
	}
}