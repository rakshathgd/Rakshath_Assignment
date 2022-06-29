package corejava.assignments.stringBuilder;

public class Reverse {

	public static void main(String[] args) {
		String s1="This method returns the reversed object on which it was called";
		StringBuffer s =new StringBuffer(s1);
		s.reverse();
		System.out.println(s);

	}

}
