import java.util.Random;

/*
 * Created on May 28, 2020 by mttr.
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] newArray = new int[11]; // Initialize array;
		Random random = new Random();
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = random.nextInt(30);
		}
		
		System.out.println("======UNSORTED=======");
		printArray(newArray);
		System.out.println("=======SORTED========");
		sortArray(newArray);
		printArray(newArray);
	}

	public static void printArray(int[] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

	public static void sortArray(int[] array) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					sorted = false;
				}
			}
		}
	}
}
