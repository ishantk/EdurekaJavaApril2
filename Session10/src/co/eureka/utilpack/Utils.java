package co.eureka.utilpack;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name = scanner.nextLine();
		
		System.out.println("Hello, "+name);
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String formattedDate = sdf.format(date);
		
		//long secs = date.getTime();
		//System.out.println("secs is: "+secs);
		
		//Date date1 = new Date(secs);
		
		System.out.println("Today is "+formattedDate);

	}

}
