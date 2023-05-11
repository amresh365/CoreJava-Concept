package getinput;

import java.util.Scanner;

public class myapplication {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the textline");
		String text=input.nextLine();
		System.out.println("yourline is"+text);
	}

}
