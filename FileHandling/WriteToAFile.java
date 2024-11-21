package Nov22;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		try {
			fw=new FileWriter( "/Users/dheerajm/Documents/javaFiles/Course/src/Nov22/file1.txt");
			fw.write("Hello world. This is a write operation.");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
