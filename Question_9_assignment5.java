package Assignment_5;

public class Question_9_assignment5 {

	public static void main(String[] args) {

		int lastno = 16;
		
		if (lastno%2 == 1) {
			
			for (int i = 1; i<=lastno-2; i++)
	        {
	    		if (i % 2 != 0) {
					System.out.print(i + ", ");
				}
	        }
			
			System.out.println(lastno);
			
			
			
		} else {
			
			for (int i = 1; i<=lastno-3; i++)
	        {
	    		if (i % 2 != 0) {
					System.out.print(i + ", ");
				}
	        }
			
			System.out.println(lastno-1);
			
		
		}
	}

}
