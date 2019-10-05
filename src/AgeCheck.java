import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age");
		int Age = s.nextInt();
		if (Age>=18)
			System.out.println("Major");
		else
			System.out.println("Minor");

	}

}
