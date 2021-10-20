package objectclass;

import java.util.Scanner;  

public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		int num = scan.nextInt();  
		
		findOddEven(num);
		
		
		
	}

	private static void findOddEven(int num) {
		if(num%2 == 0) {
			System.out.println(num +" is a even number");
		}
		else {
			System.out.println(num +" is a odd number");
		}
		
		
	}

}
