package module_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class My_Collections {

	public static void main(String[] args) throws Exception {
//		Convert an array into a collection
		String std_arr[] = { "Raghav", "Mohan", "Rohit", "Jay" };
		System.out.println("Array: " + Arrays.toString(std_arr));
		System.out.println("Type: " + std_arr.getClass().getSimpleName());
		List<String> std_list = Arrays.asList(std_arr);
		System.out.println("Converted Collection: " + std_list);
		System.out.println("Type: " + std_list.getClass().getSimpleName());
		System.out.println("-------------------------------------------------");

//		Change a collection to an array
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		System.out.println("Collection: " + list);
		System.out.println("Type: " + list.getClass().getSimpleName());
		String[] arr = list.toArray(new String[0]);
		System.out.println("Converted array: " + Arrays.toString(arr));
		System.out.println("Type: " + arr.getClass().getSimpleName());
		System.out.println("--------------------------------------------------");

//		 Iterate through elements of HashMap
		HashMap<Integer, String> map = new HashMap<>();
		String book1 = "Alchemist";
		String book2 = "Secret 7";
		map.put(1, book1);
		map.put(2, book2);
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key= " + entry.getKey() + " , Value= " + entry.getValue());
		}
		System.out.println("--------------------------------------------------");

//		Find a sublist in a List
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(9);
		arr1.add(11);
		arr1.add(5);
		arr1.add(9);
		arr1.add(11);
		System.out.println("Source list: " + arr1);
		// List<Integer> arr2 = arr1.subList(1, 3);
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(9);
		arr2.add(11);
		System.out.println("Sublist: " + arr2);
		int index = Collections.indexOfSubList(arr1, arr2);
		System.out.println("Sublist starts at index (first occurence) - " + index);
		System.out.println("Sublist starts at index (last occurence) - " + Collections.lastIndexOfSubList(arr1, arr2));
	}
}
