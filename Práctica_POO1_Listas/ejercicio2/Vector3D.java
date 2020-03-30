package ejercicio2;

public class Vector3D {

	private int[] v = new int[3];

	public Vector3D() {

	}

	public Vector3D(int i, int j, int k) {

		this.v[0] = i;

		this.v[1] = j;

		this.v[2] = k;

	}

	public void initializeVector(int i, int j, int k) {

		this.v[0] = i;

		this.v[1] = j;

		this.v[2] = k;

	}

	public Vector3D sumVectors(Vector3D a) {

		Vector3D sum = new Vector3D();

		sum.v[0] = this.v[0] + a.v[0];

		sum.v[1] = this.v[1] + a.v[1];

		sum.v[2] = this.v[2] + a.v[2];

		return sum;

	}

	public Vector3D subtract(Vector3D a) {

		Vector3D rest = new Vector3D();

		rest.v[0] = this.v[0] - a.v[0];

		rest.v[1] = this.v[1] - a.v[1];

		rest.v[2] = this.v[2] - a.v[2];

		return rest;

	}

	public double calculateModule() {

		double result;

		result = Math.sqrt(Math.pow(this.v[0], 2) + Math.pow(this.v[1], 2) + Math.pow(this.v[2], 2));

		return result;

	}

	public double scalarProduct(Vector3D a) {

		double result;

		result = this.v[0] * a.v[0] + this.v[1] * a.v[1] + this.v[2] * a.v[2];

		return result;

	}

	public Vector3D vectorProduct(Vector3D a) {

		Vector3D p = new Vector3D();

		p.v[0] = ((this.v[1] * a.v[2]) - (a.v[1] * this.v[2]));

		p.v[1] = ((a.v[0] * this.v[2]) - (this.v[0] * a.v[2]));

		p.v[2] = ((this.v[0] * a.v[1]) - (a.v[0] * this.v[1]));

		return p;

	}

	@Override
	public String toString() {

		String s = "<" + this.v[0] + ", " + this.v[1] + ", " + this.v[2] + ">";

		return s;

	}

}
