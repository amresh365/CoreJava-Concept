package example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		File file=new File("example.text");
		try {
			
			Scanner readFile =new Scanner(file);
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not found:"+file.toString());
		}
		System.out.println("amresh gupta");
		
	}

}
