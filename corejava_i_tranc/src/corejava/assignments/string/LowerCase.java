package corejava.assignments.string;

public class LowerCase {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.print("LowerCase: ");
		System.out.println(str.toLowerCase());
		System.out.print("UpperCase: ");
		System.out.println(str.toUpperCase());
		System.out.print("Replace: ");
		System.out.println(str.replace('a', '$'));
		System.out.print("Contains: ");
		System.out.println(str.contains("collection"));
		System.out.print("Matches: ");
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.matches(str1));
		System.out.print("Equals: ");
		System.out.println(str.equalsIgnoreCase(str1));
		
		

	}

}
