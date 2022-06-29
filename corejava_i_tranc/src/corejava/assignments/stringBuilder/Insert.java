package corejava.assignments.stringBuilder;

public class Insert {

	public static void main(String[] args) {
		StringBuilder s =new StringBuilder();
		String s1="insert text",s2="it is used _ at the specified index postion";
		s.append(s2).replace(11, 12,s1);
		System.out.println(s);
	}

}
