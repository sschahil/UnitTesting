//Exercise 3-9

import java.util.*;
public class Fibonacci {

	public static void displaysequence (int iteration) {
		int fib_num1 = 1;
		int fib_num2 = 1;
		int fib_num = 1;
		
		String list = "";
		for(int i = 0; i < iteration; i++)
		{
			if(i > 1){
				fib_num = fib_num1 + fib_num2;
				fib_num1 = fib_num2;
				fib_num2 = fib_num;
			}
			list += fib_num + " " ; 
		}
		System.out.println(list);	
	}
	
	//this method is made for testing purposes only
	public int total_sequence(int iteration) {
		int total = 0; // for test purpose
		int fib_num1 = 1;
		int fib_num2 = 1;
		int fib_num = 1;
		
		for(int i = 0; i < iteration; i++)
		{
			if(i > 1){
				fib_num = fib_num1 + fib_num2;
				fib_num1 = fib_num2;
				fib_num2 = fib_num;
			}
			
			total += fib_num; // adding up all the numbers in the fibonacci sequence 
		}
		
		return total;
	}// end of total_sequence method
	
	public int iterationstep() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int fib_number;
		
		System.out.println("Enter the number to which you want to run the fibonacci sequence:");
		fib_number = input.nextInt();
		
		return fib_number;
	}// end of iteration step method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib_display =  new Fibonacci(); 
		
		
		displaysequence(fib_display.iterationstep());// displays the fibonacci sequence
		
	}// end of main method

}// end of fibonacci class
