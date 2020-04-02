package ejercicioExtra;

import java.util.ArrayList;

public class Conjunto<T> {

	private ArrayList<T> conjunto = new ArrayList<>();

	public boolean addElement(T element) {

		if (this.conjunto.contains(element)) {

			return false;

		} else {

			this.conjunto.add(element);

			return true;

		}

	}

	public boolean removeElement(T element) {

		if (this.conjunto.contains(element)) {

			this.conjunto.remove(element);

			return true;

		} else {

			return false;

		}

	}

	public Conjunto<T> union(Conjunto<T> a) {

		Conjunto<T> u = new Conjunto<>();

		for (T i : this.conjunto) {

			u.addElement(i);

		}

		for (T j : a.conjunto) {

			u.addElement(j);
		}

		return u;

	}

	public Conjunto<T> interseccion(Conjunto<T> a) {

		Conjunto<T> c = new Conjunto<>();

		for (T i : this.conjunto) {

			if (a.conjunto.contains(i)) {

				c.conjunto.add(i);

			}

		}

		return c;

	}

	public Conjunto<T> diferencia(Conjunto<T> a) {

		Conjunto<T> d = new Conjunto<>();

		for (T i : this.conjunto) {

			if (!a.conjunto.contains(i)) {

				d.conjunto.add(i);

			}

		}

		return d;

	}

	public boolean bePartOf(T element) {

		if (this.conjunto.contains(element)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean subconjunto(Conjunto<T> a) {

		for (T i : this.conjunto) {

			if (!a.conjunto.contains(i)) {

				return false;

			}

		}

		return true;

	}

	public boolean twins(Conjunto<T> a) {

		for (T i : this.conjunto) {

			if (!a.bePartOf(i)) {

				for (T j : a.conjunto) {

					if (!this.bePartOf(j)) {

						return false;

					}

				}

				return false;

			}

		}

		return true;

	}

	@Override
	public String toString() {

		String s = "Este conjunto contiene los siguientes elementos:{";

		for (T i : this.conjunto) {

			s += "el " + i + ",";

		}

		s = s.substring(0, s.length() - 1);

		return s + "}";

	}

}
