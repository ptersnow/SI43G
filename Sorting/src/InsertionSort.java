
public class InsertionSort {
	
	public static int[] sort(int[] vec) {
		int i, j, aux;
		
		for (i = 1; i < vec.length; i++) {
			aux = vec[i];
			j = i - 1;
			
			while(j >= 0 && vec[j] > aux) {
				vec[j + 1] = vec[j];
		        j--;
			}
			vec[j] = aux;
		}
		
		return vec;
	}
}