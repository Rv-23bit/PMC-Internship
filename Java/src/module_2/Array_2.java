package module_2;

public class Array_2 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		int c0 = 0, c1 = 0, c2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				c0++;
			} else if (arr[i] == 1) {
				c1++;
			} else if (arr[i] == 2) {
				c2++;
			}
		}
		for (int i = 0; i < c0; i++) {
//			arr[i] = 0;
			System.out.print(0 + " ");
		}
		for (int i = 0; i < c1; i++) {
//			arr[i] = 1;
			System.out.print(1 + " ");
		}
		for (int i = 0; i < c2; i++) {
//			arr[i] = 2;
			System.out.print(2 + " ");
		}
	}

}
