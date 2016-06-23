public class QuickSort {

	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int temp;
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;

				i++;
				j--;
			}
		}

		if (low < j) {
			quicksort(low, j);
		}

		if (i < high) {
			quicksort(i, high);
		}
	}
}
