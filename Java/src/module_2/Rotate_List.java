package module_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate_List {

	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("Original list: "+ list);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of right rotations: ");
		int rotations = input.nextInt();
		int temp = 0;
		for (int i = 0; i < rotations; i++) {
			temp = list.get(6);
			for (int j = 6; j > 0; j--) {
				list.set(j, list.get(j - 1));
			}
			list.set(0, temp);
		}
		System.out.println("Rotated list: "+ list);
		input.close();
	}

}
