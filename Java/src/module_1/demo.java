package module_1;

import java.util.ArrayList;
import java.util.List;

public class demo {
	
	public static void print(List<? extends Number> list) {
		for (Number n : list)
			System.out.print(n + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(9);
		list.add(8.5);
		list.add(1022);
		list.add(900000222.6);
		
		demo.print(list);
	}

}
