package corejava.assignment.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
	int AuthorID() default 123;

	String Author() default "Akash";

	String Supervisor() default "Mr.John";

	int Date() default 23 / 06 / 2022;

	int Time() default 9;

	int Version() default 10;

	String Description() default "Persional Data";
}

@Info
class PersionalInfo {
	String name;
	int age;

	public PersionalInfo(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void Data(String Author) {
		this.name = Author;
		System.out.println(Author);
	}

}

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersionalInfo p = new PersionalInfo("Ganesh", 22);

		p.Data("Dinesh");

		Class c = p.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info) an;
		System.out.println(i.Author());
		System.out.println(i.Supervisor());
		System.out.println(i.AuthorID());
		System.out.println(i.Date());

	}

}
