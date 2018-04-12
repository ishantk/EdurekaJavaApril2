package co.edureka.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileIODemo {

	void writeInFile(){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edurekastudents.txt");
			
			// FOS will write the data from Program into the file in the form of bytes
			FileOutputStream fos = new FileOutputStream(file,true); 
			// true -> append mode
			
			String data = "\nFionna\nJennie\nJack\nJim\nJoe"; 
			
			fos.write(data.getBytes()); // Write the data in the form of bytes
			
			fos.close();
			
			System.out.println("File Written with Data");
			
		} catch (Exception e) {
			System.out.println("Some Eception: "+e);
		}
		
	}
	
	void writeInFileAgain(){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edurekastudents1.txt");
			
			// FW will write the data from Program into the file in the form of characters
			FileWriter fw = new FileWriter(file,true); 
			// true -> append mode
			
			String data = "Fionna\nJennie\nJack\nJim\nJoe"; 
			
			fw.write(data); // Write the data in the form of characters
			
			fw.close();
			
			System.out.println("File Written with Data");
			
		} catch (Exception e) {
			System.out.println("Some Eception: "+e);
		}
		
	}
	
	public static void main(String[] args) {
		
		FileIODemo fRef = new FileIODemo();
		//fRef.writeInFile();
		fRef.writeInFileAgain();

	}

}
