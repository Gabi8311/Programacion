package ejercicio3;

//Ver dónde se ponen los settes y los gettes
public class Tablero {

	private String[][] tablero;

	public Tablero() {

		tablero = new String[3][3];

		iniciarTablero();
	}

	public Tablero(String[][] tablero) {

		this.tablero = tablero;
	}

	public String[][] getTablero() {

		return tablero;
	}

	public void setTablero(String[][] tablero) {

		this.tablero = tablero;
	}

	public void iniciarTablero() {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {

				this.tablero[i][j] = "-";

			}

		}

	}

	public void imprimirTablero() {

		for (int i = 0; i < this.tablero.length; i++) {

			for (int j = 0; j < this.tablero[0].length; j++) {

				System.out.print("[ " + this.tablero[i][j] + " ]" + " ");

			}

			System.out.println("");
		}

	}

	public int ponerFicha(int fila, int columna, String ficha, boolean maquina) {

		if ((fila < 0 || fila > 2) || (columna < 0 || columna > 2)) {

			System.out.println("COORDENADA INCORRECTA.");

			System.out.println("Introducir nueva fila y columna");

			return -1;// coordenada incorrecta

		} else if (this.tablero[fila][columna] != "-") {

			if (!maquina) {

				System.out.println("CASILLA OCUPADA");

			}
			return -2;// casilla ocupada

		} else {

			this.tablero[fila][columna] = ficha;

			return 0;

		}

	}

	public boolean comprobarGanador() {

		if ((this.tablero[0][0] != "-") && (this.tablero[0][0] == this.tablero[0][1])

				&& (this.tablero[0][0] == this.tablero[0][2])) {

			return true;

		}

		if ((this.tablero[1][0] != "-") && (this.tablero[1][0] == this.tablero[1][1])

				&& (this.tablero[1][0] == this.tablero[1][2])) {

			return true;

		}

		if ((this.tablero[2][0] != "-") && (this.tablero[2][0] == this.tablero[2][1])

				&& (this.tablero[2][0] == this.tablero[2][2])) {

			return true;

		}

		if ((this.tablero[0][0] != "-") && (this.tablero[0][0] == this.tablero[1][0])

				&& (this.tablero[0][0] == this.tablero[2][0])) {

			return true;

		}

		if ((this.tablero[0][1] != "-") && (this.tablero[0][1] == this.tablero[1][1])

				&& (this.tablero[0][1] == this.tablero[2][1])) {

			return true;

		}

		if ((this.tablero[0][2] != "-") && (this.tablero[0][2] == this.tablero[1][2])

				&& (this.tablero[0][2] == this.tablero[2][2])) {

			return true;

		}

		if ((this.tablero[0][0] != "-") && (this.tablero[0][0] == this.tablero[1][1])

				&& (this.tablero[0][0] == this.tablero[2][2])) {

			return true;

		}

		if ((this.tablero[2][0] != "-") && (this.tablero[2][0] == this.tablero[1][1])

				&& (this.tablero[2][0] == this.tablero[0][2])) {

			return true;

		}

		return false;

	}

}
