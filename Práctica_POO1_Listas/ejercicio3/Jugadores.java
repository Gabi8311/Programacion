package ejercicio3;

import java.util.Random;

import java.util.Scanner;

public class Jugadores {

	private String ficha;

	private String nombre;

	private Tablero t = new Tablero();

	public Jugadores() {

	}

	public Jugadores(String ficha) {

		this.ficha = ficha;

	}

	public Jugadores(String nombre, String ficha) {

		this.nombre = nombre;

		this.ficha = ficha;
		
	}

	public Jugadores(String nombre, String ficha, Tablero t) {

		this.nombre = nombre;

		this.ficha = ficha;

		this.t = t;

	}

	public void jugPersona(int fila, int columna) {

		Scanner sc = new Scanner(System.in);

		do {

			fila = sc.nextInt();
			sc.nextLine();

			columna = sc.nextInt();
			sc.nextLine();

		} while (t.ponerFicha(fila, columna, ficha, false) != 0);

	}

	public void jugMaquina(int fila, int columna) {

		Random r = new Random();

		do {

			fila = r.nextInt(3);

			columna = r.nextInt(3);

		} while (t.ponerFicha(fila, columna, ficha, true) != 0);

	}

	public String getFicha() {

		return ficha;
	}

	public void setFicha(String ficha) {

		this.ficha = ficha;
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public Tablero getT() {

		return t;
	}

	public void setT(Tablero t) {

		this.t = t;
	}

}
