import java.util.Random;

/*
 * Created on Jun 16, 2020 by mttr.
 */

public class SelectionSort {

	public static void main(String[] args) {
		int[] newArray = new int[14]; // Initialize array;
		Random random = new Random();

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = random.nextInt(30);
		}

		System.out.println("======UNSORTED=======");
		printArray(newArray);
		System.out.println("=======SORTED========");
		selectionSort(newArray);
		printArray(newArray);
	}

	public static void printArray(int[] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minId = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minId = j;
				}
			}
			// swap
			int temp = array[i];
			array[i] = min;
			array[minId] = temp;
		}
	}
}
