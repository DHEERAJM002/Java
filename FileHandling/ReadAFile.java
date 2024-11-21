package Nov22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {
	public static void main(String[] args) {
		try {
			File fr=new File("/Users/dheerajm/Documents/javaFiles/Course/src/Nov22/file1.txt");
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
