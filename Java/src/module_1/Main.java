package module_1;

class Pair {

	private Object key;
	private Object value;

	public Pair(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	public Object getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}

//	public void setKeyValue(Pair<String, Integer> obj) {
//		this.key = key;
//		this.value = value
//	}

	public void setKey(Object key) {
		this.key = key;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}

class Main {
	public static void main(String[] args) throws Exception {
		Pair obj = new Pair("PMC", 23);
		System.out.println("Key: " + obj.getKey());
		System.out.println("Value: " + obj.getValue());
	}
}