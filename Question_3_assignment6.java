package Assignment_6;
import java.util.Scanner;
public class Question_3_assignment6 {

	public static void main(String[] args) {
		  
        Scanner scanner = new Scanner(System.in);

       int num=7;
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++){
        
            for (int j = 1; j < i; j++){
            
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++) {
           
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
       
            for (int j = 1; j < i; j++){
            
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++){
            
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

		

	}


