package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Conjunto c1 = new Conjunto();

		Conjunto c2 = new Conjunto();

		Conjunto c3 = new Conjunto();

		int opc;

		int elemento;

		c1.addElement(1);
		c1.addElement(2);
		c1.addElement(3);
		c1.addElement(4);
		c1.addElement(5);

		c2.addElement(4);
		c2.addElement(5);
		c2.addElement(6);
		c2.addElement(7);
		c2.addElement(8);

		System.out.println("Bienvenido al Main del Ejercicio 1 de la Entrega de POO/Listas");
		System.out.println("..............................................................");

		do {

			System.out.println("Estas son las opciones que tienes:");
			System.out.println("");
			System.out.println("1.Añadir un elemento al conjunto");
			System.out.println("2.Eliminar un elemento del conjunto");
			System.out.println("3.Hacer la unión de dos conjuntos");
			System.out.println("4.Hacer la intersección de dos conjuntos");
			System.out.println("5.Hacer la diferencia de dos conjuntos");
			System.out.println("6.Comprobar si un elemento pertenece a un grupo");
			System.out.println("7.Comprobar si un conjunto es subconjunto de otro");
			System.out.println("8.Comprobar si dos conjuntos son iguales");
			System.out.println("9.Imprimir un conjunto");
			System.out.println("10.Salir");
			System.out.println("..............................");
			System.out.println("Introduce la opción que deseas");

			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1:

				System.out.println("¿Qué elemento quieres añadir?");

				elemento = sc.nextInt();
				sc.nextLine();

				if (c1.addElement(elemento) == false) {

					System.out.println("Este conjunto ya contiene este elemento");
					System.out.println("");

				} else {

					System.out.println("Elemento añadido");
					System.out.println("................");
				}

				break;

			case 2:

				System.out.println("¿Qué elemento quieres eliminar");

				elemento = sc.nextInt();
				sc.nextLine();

				if (c1.removeElement(elemento) == false) {

					System.out.println("El elemento que intentas borrar,no está en el conjunto");
					System.out.println("");

				} else {

					System.out.println("Elemento eliminado");
					System.out.println("..................");

				}

				break;

			case 3:
				// Vamos a hacer la unión del conjunto c1 y el conjunto c2

				c3 = c1.union(c2);

				System.out.println(c3);
				System.out.println("");

				break;

			case 4:
				// Vamos a hacer la intersección del conjunto c1 y el conjunto c2

				c3 = c1.interseccion(c2);

				System.out.println(c3);
				System.out.println("");

				break;

			case 5:
				// Vamos a hacer la diferencia del conjunto c1 y el conjunto c2

				c3 = c1.diferencia(c2);

				System.out.println(c3);
				System.out.println("");

				break;

			case 6:

				System.out.println("¿Qué elemento quieres saber si está en el conjunto?");

				elemento = sc.nextInt();
				sc.nextLine();

				if (c1.bePartOf(elemento) == false) {

					System.out.println("Este elemento no forma parte del conjunto");
					System.out.println("");

				} else {

					System.out.println("Este elemento forma parte del conjunto");
					System.out.println("");

				}

				break;

			case 7:

				if (c1.subconjunto(c2) == false) {

					System.out.println("Este conjunto no es subconjunto del segundo");
					System.out.println("");

				} else {

					System.out.println("Este conjunto es subconjunto del segundo");
					System.out.println("");

				}

				break;

			case 8:
				// Vamos a ver si el conjunto c1 y el conjunto c2,son iguales

				if (c1.twins(c2) == false) {

					System.out.println("Los conjuntos comparados no son iguales");
					System.out.println("");

				} else {

					System.out.println("Los conjuntos comparados son iguales");
					System.out.println("");

				}

				break;

			case 9:
				// Vamos a imprimir el conjunto c1

				System.out.println(c1);
				System.out.println("");

				break;

			case 10:

				System.out.println("Gracias por utilizar nuestro Main.Adiós!!");

				break;

			default:

				System.out.println("*********************");
				System.out.println("* OPCIÓN INCORRECTA *");
				System.out.println("*********************");

			}

		} while (opc != 10);

		sc.close();

	}

}
