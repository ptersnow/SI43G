public class MergeSort {

	private int[] numbers;
	private int number;
	private int[] helper;

	public void sort(int[] values) {
		this.numbers = values;
		this.number = values.length;
		this.helper = new int[number];
		mergesort(0, number - 1);
	}

	public void mergesort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;

			mergesort(low, middle);
			mergesort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		int i = low;
		int j = middle + 1;
		int k = low;

		for (int l = low; l <= high; l++) {
			helper[l] = numbers[l];
		}

		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
}
