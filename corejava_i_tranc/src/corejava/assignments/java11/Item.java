package corejava.assignments.java11;

import java.util.Scanner;

public class Item {
	private double price;
	private double total = 0;

	public Item() {
		super();

	}

	public Item(double price, double total) {
		super();
		this.price = price;
		this.total = total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Item obj = new Item();
		System.out.println("1:Insert New Price,2:view Purchase Total,3:Exit");
		int n = sc.nextInt();
		for (int i = 0;;) {

			if (n == 1) {
				double p = sc.nextDouble();
				obj.setPrice(p);
				obj.setTotal(obj.total + obj.getPrice());
				System.out.println("Do you want to enter price for more items?(yes/no)");
				String s = sc.next();
				if (s.equals("yes")) {
					i++;
				} else {
					for (int j = 0;;) {
						System.out.println("1:Insert New Price,2:view Purchase Total,3:Exit");
						n = sc.nextInt();
						if (n == 2) {

							System.out.println(obj.total);
							j++;
						}
						if (n == 3) {
							System.out.println("exit program");
							break;
						}
					}
					break;
				}
			}

		}

	}

}