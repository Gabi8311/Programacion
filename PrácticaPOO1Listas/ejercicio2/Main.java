package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector3D v1 = new Vector3D();

		Vector3D v2 = new Vector3D(4,5,6);

		Vector3D v3 = new Vector3D();

		int opc;

		int i;

		int j;

		int k;

		System.out.println("Bienvenido al Main del Ejercicio 2 de la Entrega de POO/Listas");
		System.out.println("..............................................................");

		do {

			System.out.println("Estas son las opciones que tienes:");
			System.out.println("");
			System.out.println("1.Inicializa un vector con tres números");
			System.out.println("2.Sumar dos vectores");
			System.out.println("3.Restar dos vectores");
			System.out.println("4.Calcular el módulo de un vector");
			System.out.println("5.Calcular el producto escalar de dos vectores");
			System.out.println("6.Calcular el producto vectorial de dos vectores");
			System.out.println("7.Imprimir vector");
			System.out.println("8.Salir");
			System.out.println("..............................");
			System.out.println("Introduce la opción que deseas");

			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1:

				System.out.println("Introduce las coordenadas que quieres darle al vector");
				System.out.println("");
				System.out.println("Introduce la 1ª coordenada");

				i = sc.nextInt();
				sc.nextLine();

				System.out.println("Introduce la 2ª coordenada");

				j = sc.nextInt();
				sc.nextLine();

				System.out.println("Introduce la 3ª coordenada");

				k = sc.nextInt();
				sc.nextLine();

				v1.initializeVector(i, j, k);

				break;

			case 2:
				// Vamos a sumar el Vector v1 con el Vector v2

				v3 = v1.sumVectors(v2);

				System.out.println("El vector resultante es: " + v3);
				System.out.println("");

				break;

			case 3:
				// Vamos a restar el Vector v1 con el Vector v2

				v3 = v1.subtract(v2);

				System.out.println("El vector resultante es: " + v3);
				System.out.println("");

				break;

			case 4:
				// Calculamos el módulo del Vector v1

				System.out.println("El módulo de este Vector es: " + v1.calculateModule());
				System.out.println("");

				break;

			case 5:
				// Calculamos el producto escalar del Vector v1 y el Vector v2

				System.out.println("El producto escalar de estos dos Vectores es: " + v1.scalarProduct(v2));
				System.out.println("");

				break;

			case 6:
				// Calculamos el producto vectorial del Vector v1 y el Vector v2

				System.out.println("El producto vectorial de estos dos Vectores es: " + v1.vectorProduct(v2));
				System.out.println("");

				break;

			case 7:

				System.out.println("Las coordenadas de este Vector son: " + v1);
				System.out.println("");

				break;

			case 8:

				System.out.println("Gracias por utilizar nuestro Main.Adiós!!");

				break;

			default:

				System.out.println("*********************");
				System.out.println("* OPCIÓN INCORRECTA *");
				System.out.println("*********************");

			}

		} while (opc != 8);

		sc.close();

	}

}
