package corejava.assignments.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Odd_Length {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Kishore");//true
		a.add("Rakshath");
		a.add("kiki");
		a.add("raks");
		

			
		Predicate<String> length = l -> l.length() % 2 != 0;
		a.removeIf(length);

		System.out.println(a);
		
		
		
	}

}
