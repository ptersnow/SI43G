
public class Main {

	public static void main(String[] args) {
		
		Matrix a = null;
		Matrix b = null;
		Matrix c = null;
		
		a = new Matrix();
		if (a != null) {
			a.print();
		}

		b = new Matrix();
		if (b != null) {
			b.print();
		}
		
		c = Matrix.add(a, b);
		if (c != null) {
			c.print();
		} else {
			System.err.println("Erro na adicao de matriz.");
		}
		
		c = null;
		c = Matrix.multiply(a, b);
		if (c != null) {
			c.print();
		} else {
			System.err.println("Erro na multiplicacao de matriz.");
		}
		
		c = null;
		c = Matrix.transpose(a);
		if (c != null) {
			c.print();
		} else {
			System.err.println("Erro na transposicao da matriz.");
		}
		
		System.out.println("All done");
	}
}
