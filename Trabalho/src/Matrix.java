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
				
				this.matrix_setelem(i, j, val);
			}
		} while (i != 0);
		
		leitor.close();
	}

	float matrix_getelem(int x, int y) {
		return 0;
	}

	int matrix_setelem(int x, int y, float elem) {
		return 0;
	}

	int matrix_print() {
		return 0;
	}

	int matrix_add(Matrix m, Matrix n, Matrix r) {
		return 0;
	}

	int matrix_multiply(Matrix m, Matrix n, Matrix r) {
		return 0;
	}

	int matrix_transpose(Matrix m, Matrix r) {
		return 0;
	}
}
