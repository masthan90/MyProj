import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter X");
		int X = s.nextInt();
		if(X > 0)
			System.out.println("X is Positive ");
		else
			if (X < 0)
			System.out.println("X is Negative ");
			else 
			System.out.println("X is ZERO");

	}

}
