import java.util.Random;

/*
 * Created on May 28, 2020 by mttr.
 */

public class InsertionSort {

	public static void main(String[] args) {

		int[] newArray = new int[9]; // Initialize array;
		Random random = new Random();

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = random.nextInt(10);
		}

		System.out.println("======UNSORTED=======");
		printArray(newArray);
		System.out.println("======SORTED=========");
		insertionSort(newArray);
		printArray(newArray);
	}

	public static void printArray(int[] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			// в этой точке мы вышли, так что j так же -1
			// или в первом элементе, где текущий >= a[j]
			array[j + 1] = current;
		}
	}
}
