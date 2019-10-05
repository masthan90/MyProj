import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Numbers N1 & N2");
		int N1  = s.nextInt();
		int N2 = s.nextInt();
		System.out.println("Enter Choise from 1. Add 2.Subtract 3.Multiply 4.Divide");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1: res = N1 + N2; break;
		case 2: res = N1 - N2; break;
		case 3: res = N1 * N2; break;
		case 4: res = N1 / N2; break;
		default: System.out.println("Invalid Selecton");
		System.exit(1);
		}
		System.out.println("Result =" +res);
		

	}

}
