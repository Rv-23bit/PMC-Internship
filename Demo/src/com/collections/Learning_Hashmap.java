package com.collections;
import java.util.*;

public class Learning_Hashmap {
	
	public static void printDetails(String[] key) {
		for(int i=0;i<key.length;i++) {
			System.out.print(key[i]+"          |          ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		HashMap <Integer,String[]> map = new HashMap<>();
//		map.put(1, "This");
//		map.put(2, "is");
//		map.put(3, "Test");
		String[] book1 = {"Alchemist","Paulo coelho","Rs.500 "};
		String[] book2 = {"Secret   ","Mystic warth","Rs.1000"};
		String[] book3 = {"Four Hour","Paulo coelho","Rs.200 "};
		String[] book4 = {"OOP Java ","P.C Hardwell","Rs.450 "};
		String[] book5 = {"Bad Dream","R.V Renaince","Rs.2500"};
		map.put(1, book1);
		map.put(2, book2);
		map.put(3, book3);
		map.put(4, book4);
		map.put(5, book5);
//		System.out.println(map.get(2));
//		System.out.println(map);
//		System.out.println("Map size: "+map.size());
//		System.out.println(map.get(1));
		System.out.println("Book Name          |          Author Name           |          Price            |");
		System.out.println("-------------------|--------------------------------|---------------------------|");
		printDetails(map.get(1));
		printDetails(map.get(2));
		printDetails(map.get(3));
		printDetails(map.get(4));
		printDetails(map.get(5));
//		if(map.containsKey(2)) {
//			String value = map.get(2);
//			System.out.println("Value for 2 is: "+ value);
//		}
	}

}
