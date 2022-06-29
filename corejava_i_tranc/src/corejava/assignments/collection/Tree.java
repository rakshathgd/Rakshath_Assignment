package corejava.assignments.collection;

import java.util.*;

public class Tree {
	public static void main(String[] args) {
		Long a = Long.valueOf("3425674598");
		Long b = Long.valueOf("9025724598");
		Long c = Long.valueOf("6825627598");
		Long d = Long.valueOf("7985456598");
		Contact a1 = new Contact(a, "Raks", "rock@gmail.com", Gender.male);
		Contact a2 = new Contact(b, "Abcd", "Abcd@gmail.com", Gender.female);
		Contact a3 = new Contact(c, "Venu", "Venu@gmail.com", Gender.male);
		Contact a4 = new Contact(d, "Kiki", "Kiki@gmail.com", Gender.male);

		TreeMap<Long, Contact> info = new TreeMap<Long, Contact>(Collections.reverseOrder());
		info.put(a, a1);
		info.put(b, a2);
		info.put(c, a3);
		info.put(d, a4);
		System.out.println("All the key-Value pairs: ");
		// printing all key-value pairs
		for (Map.Entry<Long, Contact> entry : info.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		// printings all the keys
		System.out.println("All the Keys: ");
		for (Map.Entry<Long, Contact> entry : info.entrySet()) {
			System.out.println(entry.getKey());
		}
		System.out.println("All the Values: ");
		// printing all values
		for (Map.Entry<Long, Contact> entry : info.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}

enum Gender {
	male, female;
}

class Contact {
	private Long phone_number;
	private String name;
	private String email;
	private Gender gender;

	public Contact(Long phone_number, String name, String email, Gender gender) {
		this.phone_number = phone_number;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + name + " Phone no: " + phone_number + " email: " + email;
	}
}