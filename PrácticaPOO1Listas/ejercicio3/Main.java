
package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tablero t1 = new Tablero();

		Jugadores j1 = new Jugadores();

		Jugadores j2 = new Jugadores();

		Jugadores m = new Jugadores("M", "MÁQUINA", t1);

		Juego juego1 = new Juego(t1);

		int opc = 1;

		System.out.println(".............................");
		System.out.println("Bienvenido al Juego 3 en Raya");
		System.out.println(".............................");

		do {

			System.out.println("");
			System.out.println("Elige una de las opciones:");
			System.out.println("");
			System.out.println("1.Jugar contra otro jugador");
			System.out.println("2.Jugar contra la máquina");
			System.out.println("3.Salir");

			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1:

				juego1.jugar(j1, j2);

				break;

			case 2:

				juego1.jugarVsMaquina(j1, m);

				break;

			case 3:

				System.out.println(".................");
				System.out.println("SE ACABÓ EL JUEGO");
				System.out.println(".................");

				break;

			default:

				System.out.println("*****************");
				System.out.println("Opción incorrecta");
				System.out.println("*****************");

			}

		} while (opc < 1 || opc > 3);

	}

}