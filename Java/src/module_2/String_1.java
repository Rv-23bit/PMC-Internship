package module_2;

public class String_1 {

	public static void main(String[] args) {
		String str = "Hello World";
		String x = str.trim();
		int len = 0;
		 
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
 
        System.out.println(len);
    }
}
