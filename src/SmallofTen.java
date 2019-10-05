import java.util.Scanner;

public class SmallofTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest = Integer.MAX_VALUE;
		int number;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			   System.out.print("Enter a number > ");
			   number = s.nextInt();
			 
			   if (number < smallest) 
			       smallest = number; 
			       
			}
			System.out.println("The minimum is " + smallest);
	}
}
