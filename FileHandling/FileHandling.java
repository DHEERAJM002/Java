package Nov22;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File file=new File("/Users/dheerajm/Documents/javaFiles/Course/src/Nov22/file1.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File "+file.getName()+" created successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		if(file.exists()) {
			System.out.println("Path of the created file is : "+file.getAbsolutePath());
			System.out.println("Is the created file readable?: "+file.canRead());
			System.out.println("Is the created file writable?: "+file.canWrite());
			System.out.println("Length of the file in bytes : "+file.length());
		}
		else {
			System.out.println("File doesn't exist.");
		}
	}
}
