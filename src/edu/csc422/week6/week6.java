package edu.csc422.week6;

import java.util.Random;
import java.util.Scanner;

public class week6 {

	public static void main(String[] args) {

		boolean exitnow = false;

		try {
			
			
			System.out.println("Creating a stack of default size of 20");
			Stack list1 = new Stack();
			
			
			//System.out.println("Creating a stack of user defined size");
			//Stack list1 = new Stack(5);

			
			do {
				displayMenu();

				Scanner sc = new Scanner(System.in); 

				// String input 
				String choice = sc.nextLine(); 

				switch (choice) {
				case "1":  //push
					System.out.println("\n------------------------------------------------");
					System.out.println("pushing a random number on the stack");
			        Random rand = new Random();
			        //int totalZombies = 5 + rand.nextInt(15 + 1);

					list1.push(rand.nextInt(100));
					break;
				case "2":  //pop
					System.out.println("\n------------------------------------------------");
					System.out.println("pop");
					list1.pop();
					break;
				case "3":  //peek
					System.out.println("\n------------------------------------------------");
					System.out.println("peek");
					System.out.println(list1.peek());
					break;
				case "4": // size
					System.out.println("\n------------------------------------------------");
					System.out.println("size");
					System.out.println(list1.size());
					break;
				case "5": // empty
					System.out.println("\n------------------------------------------------");
					System.out.println("empty");
					System.out.println(list1.empty());
					break;
				case "6": // display list
					System.out.println("\n------------------------------------------------");
					System.out.println("display");
					System.out.println(list1);
					break;
				case "7":
					System.out.println("\n------------------------------------------------");
					System.out.println("\nGoodbye!");
					exitnow=true;
					break;
				}
			} while (!exitnow);	 
		} catch (FullStackException |  EmptyStackException ex ) {
			System.out.println(ex); 
		}
	}


	public static void displayMenu() {
		System.out.println("\n------------------------------------------------");

		System.out.println("\nWhat would you like to do?");
		System.out.println(" 1) Push");
		System.out.println(" 2) Pop");
		System.out.println(" 3) Peek");
		System.out.println(" 4) Size");
		System.out.println(" 5) Empty");
		System.out.println(" 6) Display");
		System.out.println(" 7) Exit program");
		System.out.println("Your choice: ");
	}


}


