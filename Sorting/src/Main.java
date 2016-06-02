import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int i;
		int[] vec = new int[20];
		int[] bvec = new int[20];
		int[] ivec = new int[20];
		int[] svec = new int[20];
		Random rand = new Random();
		
		for (i = 0; i < 20; i++) {
			vec[i] = rand.nextInt(100);
		}

		System.out.print("Vetor inicial: ");
		for (i = 0; i < 20; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println();
		
		bvec = BubbleSort.sort(vec);
		System.out.print("Bubble-sort: ");
		for (i = 0; i < 20; i++) {
			System.out.print(bvec[i] + " ");
		}
		System.out.println();
		
		svec = SelectionSort.sort(vec);
		System.out.print("Selection-sort: ");
		for (i = 0; i < 20; i++) {
			System.out.print(svec[i] + " ");
		}
		System.out.println();
	}

}
