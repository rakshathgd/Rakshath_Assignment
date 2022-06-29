package corejava.assignments.lamda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Upper_Case {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Kishore");
		a.add("Rakshath");
		a.add("kiki");
		a.add("raks");
		
		a.replaceAll(new Unary());
		System.out.println(a);

	}

}
class Unary implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
	}
	
}
