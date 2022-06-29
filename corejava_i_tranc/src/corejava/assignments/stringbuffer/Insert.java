package corejava.assignments.stringbuffer;

public class Insert {

	public static void main(String[] args) {
		
		StringBuffer s =new StringBuffer();
		String s1="insert text",s2="it is used _ at the specified index postion";
		s.append(s2).replace(11, 12,s1);
		System.out.println(s);
	}

}
