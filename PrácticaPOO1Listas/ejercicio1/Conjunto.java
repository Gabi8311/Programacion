package ejercicio1;

import java.util.ArrayList;

public class Conjunto {

	private ArrayList<Integer> conjunto = new ArrayList<Integer>();

	public boolean addElement(Integer element) {

		if (this.conjunto.contains(element)) {

			return false;

		} else {

			this.conjunto.add(element);

			return true;
			
		}

	}

	public boolean removeElement(Integer element) {

		if (this.conjunto.contains(element)) {

			this.conjunto.remove(element);

			return true;

		} else {

			return false;

		}

	}

	public Conjunto union(Conjunto a) {

		Conjunto u = new Conjunto();

		for (Integer i : this.conjunto) {

			u.addElement(i);

		}

		for (Integer j : a.conjunto) {

			u.addElement(j);
			
		}

		return u;

	}

	public Conjunto interseccion(Conjunto a) {

		Conjunto c = new Conjunto();

		for (Integer i : this.conjunto) {

			if (a.conjunto.contains(i)) {

				c.conjunto.add(i);

			}

		}

		return c;

	}

	public Conjunto diferencia(Conjunto a) {

		Conjunto d = new Conjunto();

		for (Integer i : this.conjunto) {

			if (!a.conjunto.contains(i)) {

				d.conjunto.add(i);

			}

		}

		return d;

	}

	public boolean bePartOf(Integer element) {

		if (this.conjunto.contains(element)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean subconjunto(Conjunto a) {

		for (Integer i : this.conjunto) {

			if (!a.conjunto.contains(i)) {

				return false;

			}

		}

		return true;

	}

	public boolean twins(Conjunto a) {

		for (Integer i : this.conjunto) {

			if (!a.bePartOf(i)) {

				for (Integer j : a.conjunto) {

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

		for (Integer i : this.conjunto) {

			s += "el " + i + ",";

		}

		s = s.substring(0, s.length() - 1);

		return s + "}";

	}

}
