
public class BubbleSort {

	public static int[] sort(int[] vec) {
		
		int i, j, aux;
		
		for (i = 0; i < vec.length - 1; i++) {
			for (j = i + 1; j < vec.length; j++) {
				if (vec[i] > vec[j]) {
					aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
		
		return vec;
	}
	
}
