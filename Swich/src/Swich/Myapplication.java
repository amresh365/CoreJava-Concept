package Swich;

import java.util.Scanner;

public class Myapplication {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//swich statement support char,byte,int short,string;
		System.out.println("enter your instruction");
		String text= input.nextLine();
		switch(text) {
		case "run":
			System.out.println("in running status ");
			break;
		case "stop":
			System.out.println("program is stopped");
			break;
			default:
				System.out.println("not reconized");
			
		}
		
	}

}
