import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ROll No");
		int rollNo = s.nextInt();
		System.out.println("Enter Name");
		String name = s.next();
		System.out.println("Enter three Marks");
		double math = s.nextDouble();
		double phy = s.nextDouble();
		double che = s.nextDouble();
		double total = math + phy + che;
		double avg = total / 3;
		System.out.println("Roll no is " +rollNo);
		System.out.println("Name is " +name);
		System.out.println("Total Marks are " +total);
		System.out.println("Avg Marks for " +name + " is " +  +total);

	}

}
