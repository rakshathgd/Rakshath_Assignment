package corejava.assignments.stringBuilder;

public class Append {

	public static void main(String[] args) {
		StringBuilder s =new StringBuilder();
		String s1="StringBuffer ",s2="is a peer class of string",s3=" that provides much of ",s4="the functionality of strings";
		s.append(s1).append(s2).append(s3).append(s4);
		System.out.println(s);

	}

}