package corejava.assignments.generics;

import java.util.Date;


public class Pair {
	public static void main(String[] args) {
		pairs<String, String> object1 = new pairs<String, String>("1", "Hello");
		System.out.println(object1);

		Date objc = new Date();
		pairs<String, java.util.Date> object = new pairs<String, java.util.Date>("1", objc);
		System.out.println(object);
	}
}

class pairs<Key, Value> {
	private Key obj1;
	private Value obj2;

	public pairs(Key obj1, Value obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public Key getObj1() {
		return obj1;
	}

	public Value getObj2() {
		return obj2;
	}

	@Override
	public String toString() {
		return "pair [Key=" + obj1 + ", Value=" + obj2 + "]";
	}

}
