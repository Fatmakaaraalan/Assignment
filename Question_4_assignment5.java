
package Assignment_5;

import java.util.Scanner;

public class Question_4_assignment5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int number;
		System.out.println("Enter a number:");
		number=scan.nextInt();
		while(number<100 && ((number*10)<100)) {
			System.out.println(number+"="+(number*10));
			number++;
		}
		System.out.println();
		
	}
	
}

