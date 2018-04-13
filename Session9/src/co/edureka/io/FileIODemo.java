package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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
			
			File file = new File("/Users/ishantkumar/Downloads/edurekastudents1.csv");
			
			// FW will write the data from Program into the file in the form of characters
			FileWriter fw = new FileWriter(file,true); 
			// true -> append mode
			
			String data = "Fionna,Jennie,Jack,Jim,Joe"; 
			
			fw.write(data); // Write the data in the form of characters
			
			fw.close();
			
			System.out.println("File Written with Data");
			
		} catch (Exception e) {
			System.out.println("Some Eception: "+e);
		}
		
	}
	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/FileAPIDemo.java");
			
			if(file.exists()){
				
				// FIS read the data from a file in the form of bytes
				FileInputStream fis = new FileInputStream(file);
				
				int i = 0;
				char ch = ' ';
				int count = 0,check1=0,check2=0;
				
				while( (i = fis.read()) != -1){
					ch = (char)i;
					System.out.print(ch);
					if(ch=='a')
						count++;
					
					if(ch == '{')
						check1++;
					
					if(ch == '}')
						check2++;
				}
				
				System.out.println("a is found "+count+" times");
				
				System.out.println(check1);
				System.out.println(check2);
				
				if(check1 == check2){
					System.out.println("No Compilation issue for { }");
				}
				
				fis.close();
				
			}else{
				System.out.println(file.getName()+" not found !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Eception: "+e);
		}
	}
	
	void readFromFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/FileAPIDemo.java");
			
			if(file.exists()){
				
				// FR read the data from a file in the form of characters
				FileReader reader = new FileReader(file);
				// IO Chaining
				BufferedReader buffer = new BufferedReader(reader);
				
				String line = "";
				int count = 0;
				
				while( (line = buffer.readLine()) != null){
					System.out.println(line);
					
					if( !line.contains("//") && line.contains("new")){
						count++;
					}
					
				}
				
				buffer.close();
				reader.close();
				
				
				System.out.println("Objects Found in Source Code: "+count);
				
			}else{
				System.out.println(file.getName()+" not found !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Eception: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		FileIODemo fRef = new FileIODemo();
		//fRef.writeInFile();
		//fRef.writeInFileAgain();
		//fRef.readFromFile();
		fRef.readFromFileAgain();
		
	}

}
