package co.edureka.io;

import java.io.File;

public class FileAPIDemo {

	public static void main(String[] args) {
		
		//File file = new File("/Users/ishantkumar/Downloads/myfile12.txt");
		File file = new File("/Users/ishantkumar/Downloads","yourfile.txt");
		//File file = new File("/Users/ishantkumar/Downloads","MPSEndUser");
		if(file.exists()){
			System.out.println(file.getName()+" File Exists");
			
			if(file.isDirectory()){
				System.out.println(file.getName()+" is a directory");
				
				String[] fileNames = file.list();
				for(String str : fileNames){
					System.out.println(str);
				}
				
			}else{
				System.out.println(file.getName()+" is a file");
				//File newfile = new File("/Users/ishantkumar/Downloads","yourfile.txt");
				//file.renameTo(newfile); 
				//System.out.println(file.getName()+" renamed to "+newfile.getName());
				//file.delete();
				//System.out.println(file.getName()+" deleted...");
			}
			
		}else{
			System.out.println(file.getName()+" File Does Not Exists");
		}

	}

}
