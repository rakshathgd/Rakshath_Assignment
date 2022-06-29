package corejava.assignments.lamda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class MapToString {

	public static void main(String[] args) {
		StringBuilder s= new StringBuilder();
		Map<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "Kishore");
		hm.put(2, "Kishore");
		hm.put(3, "Kishore");
		hm.put(4, "Kishore");
//		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
//			System.out.println(entry);
//			
//		}
		
//		System.out.println(hm.entrySet());
		hm.entrySet().forEach(k->s.append(k));
		System.out.println(s);
		
		StringTokenizer st=new StringTokenizer(s.toString(),"=");
	while(st.hasMoreTokens())
	{
		System.out.print(st.nextToken());
	}
		
//		for (int index = 0; index < hm.size(); index++) {
//			s.append(hm.entrySet());
			
//		}
//		System.out.println(s);
	}

}
