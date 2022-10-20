package module_2;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 4 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
					System.out.println("The duplicate element is: " + arr[i]);
				
			}
//			System.out.println(arr[i]);
		}
	}

}
