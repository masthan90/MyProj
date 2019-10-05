import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int OddSum = 0,EvnSum =0;
				Scanner s = new Scanner(System.in);
				System.out.println("enter X");
				int X = s.nextInt();
				for(int i =1; i<=X ;i++ ) {
					if(i % 2 == 0)
						EvnSum = EvnSum + i;
					else
						OddSum = OddSum + i;
				}
				
				System.out.println("Sum of Even Numbers is " +EvnSum);
				System.out.println("Sum of Odd Numbers is " +OddSum);

	}

}
