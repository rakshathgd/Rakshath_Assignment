package corejava.assignments.lamda;

import java.util.ArrayList;

public class ThreadNum extends Thread {
	@Override
	 public void run(){
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(85);
	        numbers.add(67);
	        numbers.add(189);
	        numbers.add(54);
	        numbers.add(93);
	        numbers.add(29);
	        numbers.add(305);
	        //This will print the array list using a consumer function
	     
	        numbers.forEach(k -> System.out.println(k));
	    }
	public static void main(String[] args) {
		ThreadNum t=new ThreadNum();
//		Thread.currentThread();
		t.start();
		  
		

	}

}

