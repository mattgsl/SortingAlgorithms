import java.util.Random;

/*
 * Created on May 28, 2020 by mttr.
 */

public class BubbleSort {

	public static void main(String[] args) {

		int[] newArray = new int[9]; // Initialize array;
		Random random = new Random();

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = random.nextInt(20);
		}

		System.out.println("======UNSORTED=======");
		printArray(newArray);
		System.out.println("======SORTED=======");
		bubbleSort(newArray);
		printArray(newArray);
	}

	public static void printArray(int[] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

	public static void sortArray(int[] array) {

		for (int f = 0; f < array.length; f++) {
			for (int k = 0; k < array.length - 1; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k + 1];
					array[k + 1] = array[k];
					array[k] = temp;
				}
			}
		}
	}

	public static void bubbleSort(int[] array) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
}
