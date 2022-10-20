package module_1;

enum Subjects {
	DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}

public class Test {
	public static void main(String[] args) {
		
//		Returns all values of the enum Subject to array "sub"
		Subjects sub[] = Subjects.values();
		
//		Access index of the values
		for (Subjects x : sub) {
			System.out.println("Index of " + x + ": " + x.ordinal());
		}
		
//		Uncommenting the following line will throw IllegalArguementException
//		System.out.println(Subjects.valueOf("JAVA"));
	}
}