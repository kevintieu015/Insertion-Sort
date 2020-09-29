import java.util.Arrays;
//Algorithm from Intro to Algorithms 3rd Ed by CLRS

public class insertionSort {

	public static void sort(int array[]) {
		// use ++j because it will increase i by 1 then returns the new value
		// j++ returns the original value of i then increase it by 1 e
		for (int j = 1; j < array.length; ++j) {
			int key = array[j];
			int i = j - 1;
			
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i = i - 1;

			}

			array[i + 1] = key;
		}
	}

	public static void main(String args[]) {
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Randomize Array:      " + Arrays.toString(array));

		insertionSort object = new insertionSort();
		object.sort(array);
		System.out.println("Insertion sort Array: " + Arrays.toString(array));
	}
}