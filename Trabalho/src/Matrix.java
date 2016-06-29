import java.util.Scanner;

public class Matrix {

	private Cell head;

	public Matrix() {

		float val;
		Cell aux, temp;
		int i, j, lines, columns;
		Scanner leitor = new Scanner(System.in);

		lines = leitor.nextInt();
		columns = leitor.nextInt();

		head = new Cell(-1, -1, 0);
		temp = head;
		for (i = 1; i <= lines; i++) {
			aux = new Cell(i, -1, 0);
			temp.setBelow(aux);
			temp = temp.getBelow();
		}
		temp.setBelow(head);

		temp = head;
		for (j = 1; j <= columns; j++) {
			aux = new Cell(-1, j, 0);
			temp.setRight(aux);
			temp = temp.getRight();
		}
		temp.setRight(head);

		do {
			i = leitor.nextInt();
			if (i != 0) {
				j = leitor.nextInt();
				val = leitor.nextFloat();

				this.setElem(i, j, val);
			}
		} while (i != 0);

		leitor.close();
	}

	float getElem(int x, int y) {
		return 0;
	}

	int setElem(int x, int y, float elem) {
		return 0;
	}

	int print() {
		int lin, col;
		Cell temp = head.getBelow();

		lin = 0;
	    while (temp.getLine() != -1) {
	        lin++;
	        temp = temp.getBelow();
	    }

	    col = 0;
	    temp = head.getRight();
	    while (temp.getColumn() != -1) {
	        col++;
	        temp = temp.getRight();
	    }

	    temp = head.getBelow();
	    System.out.println(lin + " " + col);
		while (temp.getLine() != -1) {
			temp = temp.getRight();

			while (temp.getColumn() != -1) {
				System.out.println(temp.getLine() + " " + temp.getColumn() + " " + temp.getInfo());
				temp = temp.getRight();
			}

			temp = temp.getBelow();
		}

		return 0;
	}

	public static Matrix add(Matrix m, Matrix n) {
		return null;
	}

	public static Matrix multiply(Matrix m, Matrix n) {
		return null;
	}

	public static Matrix transpose(Matrix m) {
		return null;
	}
}
