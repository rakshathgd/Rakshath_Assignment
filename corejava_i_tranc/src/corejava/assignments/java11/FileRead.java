package corejava.assignments.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRead {

	public static void main(String[] args) {
		var path = "C:\\Users\\RAKSGD\\Downloads\\Java11Assignments_StudentList.txt";
		try {

//            Files.writeString(Path.of(path),"hello" ,StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));

			char c[] = data.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 'A' && c[i] <= 'z') {
//            System.out.println(data1);
//            System.out.println(data);
					System.out.print(c[i]);
				}
			}

		} catch (IOException e) {

			System.out.println("wrong path");
		}

	}

}