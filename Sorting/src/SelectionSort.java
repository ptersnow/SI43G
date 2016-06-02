
public class SelectionSort {

	public static int[] sort(int[] vec) {
		
		int i, j, aux, min;
		
		for (i = 0; i < vec.length - 1; i++) {
			min = i;
			for (j = i + 1; j < vec.length; j++) {
				if (vec[min] > vec[j]) {
					min = j;
				}
			}
			
			aux = vec[i];
			vec[i] = vec[min];
			vec[min] = aux;
		}
		
		return vec;
	}
}
