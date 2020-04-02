package ejercicio3;

import java.util.Random;

import java.util.Scanner;

public class Juego {

	Scanner sc = new Scanner(System.in);

	Tablero t1 ;

	Jugadores j1;

	Jugadores j2;

	Jugadores m;

	int fila = 0;

	int columna = 0;

	int contador = 0;

	int opc;

	boolean turno;
	
	public Juego(Tablero t) {
		
		this.t1 = t;
		
	}

	public void jugar(Jugadores j1, Jugadores j2) {

		Random r = new Random();

		String moneda = "";

		String moneda2 = "";

		InicializarJugadores();

		moneda = elegirCaraDeLaMoneda();

		moneda2 = tirarMoneda(r, moneda2);

		if (comprobarMoneda(moneda, moneda2)) {

			imprimirQueCaraHaSalido(moneda2);

			System.out.println("");
			System.out.println(this.j1.getNombre() + " has acertado!!Empiezas poniendo ficha");
			System.out.println("");
			
			tiempo(3);

			InicializarTablero();

			do {

				jugarJugador1();

				if (comprobarQueElJuegoHaTerminado()) {

					break;

				}

				jugarJugador2();

			} while (comprobarQueElJuegoNoHaTerminado());

		} else {

			imprimirQueCaraHaSalido(moneda2);

			System.out.println("");
			System.out.println(
					this.j1.getNombre() + ",has fallado.Empieza poniendo ficha tu adversario," + this.j2.getNombre());
			System.out.println("");
			
			tiempo(3);

			InicializarTablero();

			do {

				jugarJugador2();

				if (comprobarQueElJuegoHaTerminado()) {

					break;
				}

				jugarJugador1();

			} while (comprobarQueElJuegoNoHaTerminado());

		}

	}

	public boolean comprobarQueElJuegoNoHaTerminado() {

		return contador < 9 && t1.comprobarGanador() == false;

	}

	public boolean comprobarQueElJuegoHaTerminado() {

		return t1.comprobarGanador() == true || contador == 9 && t1.comprobarGanador() == false;

	}

	public boolean comprobarMoneda(String moneda, String moneda2) {

		return moneda2.equalsIgnoreCase(moneda);

	}

	public String tirarMoneda(Random r, String moneda2) {

		int azar;

		azar = r.nextInt(2);

		if (azar == 1) {

			moneda2 = "CARA";

		} else if (azar == 0) {

			moneda2 = "CRUZ";

		}

		return moneda2;

	}

	public String elegirCaraDeLaMoneda() {

		String moneda;

		System.out.println("Vamos a jugar a cara ó cruz para ver quién empieza");
		System.out.println("");
		System.out.println(this.j1.getNombre() + ",elige:");
		System.out.println("Cara ó Cruz??");

		moneda = sc.nextLine();

		while (!moneda.equalsIgnoreCase("CARA") && !moneda.equalsIgnoreCase("CRUZ")) {

			System.out.println("Palabra incorrecta.Vuelve a introducir.Cara ó Cruz??");

			moneda = sc.nextLine();

		}

		return moneda;

	}

	public void InicializarJugadores() {

		inicializarJugador1();

		this.j2 = new Jugadores(elegirNombre("Jugador2"), elegirFicha(), t1);

	}

	public void InicializarTablero() {

		System.out.println("Empieza la partida!!");

		System.out.println("=================");
		this.t1.imprimirTablero();
		System.out.println("=================");

	}

	public void jugarVsMaquina(Jugadores j1, Jugadores m) {

		Random r = new Random();

		String moneda = "";

		String moneda2 = "";

		inicializarJugador1();

		moneda = elegirCaraDeLaMoneda();

		moneda2 = tirarMoneda(r, moneda2);

		if (comprobarMoneda(moneda, moneda2)) {

			imprimirQueCaraHaSalido(moneda2);

			System.out.println("");
			System.out.println(this.j1.getNombre() + ",has acertado!!Empiezas poniendo ficha");
			System.out.println("");
			
			tiempo(3);

			empezarPartidaVsMaquina();

			do {

				jugarJugador1();

				if (comprobarQueElJuegoHaTerminado()) {

					break;

				}

				jugarMaquina();

			} while (comprobarQueElJuegoNoHaTerminado());

		} else {

			imprimirQueCaraHaSalido(moneda2);

			System.out.println("");
			System.out.println(this.j1.getNombre() + ",has fallado.Empieza poniendo ficha la MÁQUINA");
			System.out.println("");
			
			tiempo(3);

			empezarPartidaVsMaquina();

			do {

				jugarMaquina();

				if (comprobarQueElJuegoHaTerminado()) {

					break;

				}

				jugarJugador1();

			} while (comprobarQueElJuegoNoHaTerminado());

		}

	}

	public void inicializarJugador1() {

		this.j1 = new Jugadores(elegirNombre("Jugador1"), elegirFicha(), t1);

	}

	public void imprimirQueCaraHaSalido(String moneda2) {

		System.out.println("La moneda ha salido " + moneda2);

	}

	public void empezarPartidaVsMaquina() {

		this.m = new Jugadores("MÁQUINA", "M", t1);

		System.out.println("Empieza la partida!!");

		System.out.println("=================");
		this.t1.imprimirTablero();
		System.out.println("=================");

	}

	public void jugarJugador1() {

		do {

			contador++;

			System.out.println(this.j1.getNombre() + ":Introduce fila y columna");

			this.j1.jugPersona(fila, columna);

			System.out.println("=================");
			this.t1.imprimirTablero();
			System.out.println("=================");

			if (t1.comprobarGanador() == true) {

				System.out.println(this.j1.getNombre() + (" HAS GANADO!!"));

			}

			if (contador == 9 && t1.comprobarGanador() == false) {

				System.out.println("TABLAS!!");

			}

			turno = true;

		} while (turno == false);

	}

	public void tiempo(int segundos) {

		try {

			Thread.sleep(segundos * 1000);

		} catch (Exception Error) {

		}

	}

	public void jugarJugador2() {

		do {

			contador++;

			System.out.println(this.j2.getNombre() + ":Introduce fila y columna");

			this.j2.jugPersona(fila, columna);

			System.out.println("=================");
			this.t1.imprimirTablero();
			System.out.println("=================");

			if (t1.comprobarGanador() == true) {

				System.out.println(this.j2.getNombre() + (" HAS GANADO!!"));

			}

			if (contador == 9 && t1.comprobarGanador() == false) {

				System.out.println("TABLAS!!");

			}

			turno = true;

		} while (turno == false);

	}

	public void jugarMaquina() {

		do {

			contador++;

			System.out.println("Turno de " + this.m.getNombre());

			tiempo(2);

			this.m.jugMaquina(fila, columna);

			System.out.println("=================");
			this.t1.imprimirTablero();
			System.out.println("=================");

			if (t1.comprobarGanador() == true) {

				System.out.println(this.m.getNombre() + (" GANA!!"));

			}

			if (contador == 9 && t1.comprobarGanador() == false) {

				System.out.println("TABLAS!!");

			}

			turno = true;

		} while (turno == false);

	}

	public String elegirNombre(String nombre) {

		System.out.println(nombre);

		System.out.println("Qué nombre quieres ponerte?");

		return sc.nextLine();

	}

	public String elegirFicha() {

		System.out.println("Qué caráter eliges como ficha?");

		return sc.nextLine();

	}

}
