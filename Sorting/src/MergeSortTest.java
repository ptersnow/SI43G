import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	private int[] numbers;
	private final static int SIZE = 20;
	private final static int MAX = 50;

	@Before
	public void setUp() throws Exception {
		numbers = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generator.nextInt(MAX);
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	@Test
	public void testMergesort() {
		long startTime = System.currentTimeMillis();

		MergeSort sorter = new MergeSort();
		sorter.sort(numbers);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Mergesort elapsedTime: " + elapsedTime);

		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.print(numbers[i] + " ");
			if (numbers[i] > numbers[i + 1]) {
				fail("Should not happen");
			}
		}
		assertTrue(true);
	}
}
