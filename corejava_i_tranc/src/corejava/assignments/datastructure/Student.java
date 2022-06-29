package corejava.assignments.datastructure;

import java.util.Scanner;

public class Student {
	int a, b, c;

	public Student(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {

		int total = 0, averg = 0;
		System.out.println("Student 1 marks");
		Scanner sc = new Scanner(System.in);
		System.out.println("Subject A");
		int a1 = sc.nextInt();
		System.out.println(" Subject B");
		int b1 = sc.nextInt();
		System.out.println("Subject C");
		int c1 = sc.nextInt();
		Student s1 = new Student(a1, b1, c1);
		System.out.println("Student 2 marks");

		System.out.println("Subject A");
		int a2 = sc.nextInt();
		System.out.println(" Subject B");
		int b2 = sc.nextInt();
		System.out.println("Subject C");
		int c2 = sc.nextInt();
		Student s2 = new Student(a2, b2, c2);
		System.out.println("Student 3 marks");

		System.out.println("Subject A");
		int a3 = sc.nextInt();
		System.out.println(" Subject B");
		int b3 = sc.nextInt();
		System.out.println("Subject C");
		int c3 = sc.nextInt();
		Student s3 = new Student(a3, b3, c3);
		total = s1.a + s1.b + s1.c;
		averg = total / 3;
		System.out.println("Student 1 totalmarks " + total + " average marks " + averg);
		total = s2.a + s2.b + s3.c;
		averg = total / 3;
		System.out.println("Student 2 totalmarks " + total + " average marks " + averg);
		total = s3.a + s3.b + s3.c;
		averg = total / 3;
		System.out.println("Student 3 totalmarks " + total + " average marks " + averg);
		total = s1.a + s2.a + s3.a;
		averg = total / 3;
		System.out.println(" subject a totalmarks " + total + " average marks " + averg);
		total = s1.b + s2.b + s3.b;
		averg = total / 3;
		System.out.println(" subject b totalmarks " + total + " average marks " + averg);
		total = s1.c + s2.c + s3.c;
		averg = total / 3;
		System.out.println(" subject c totalmarks " + total + " average marks " + averg);

	}

}