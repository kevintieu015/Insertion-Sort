import java.util.Arrays;
//Algorithm from Intro to Algorithms 3rd Ed by CLRS

public class insertionSort {

	public static void sort(int array[]) {
		// use ++j because it will increase i by 1 then returns the new value
		// j++ returns the original value of i then increase it by 1 e
		for (int j = 1; j < array.length; ++j) {
			int key = array[j];
			int i = j - 1;
			// this
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i = i - 1;

			}

			array[i + 1] = key;
		}
	}
}