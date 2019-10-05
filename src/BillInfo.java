import java.util.Scanner;

public class BillInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Item");
		String itemname = s.next();
		System.out.println("Enter Item No");
		double itemNum = s.nextDouble();
		System.out.println("Enter rate");
		double rate = s.nextDouble();
		System.out.println("Enter Quantity");
		double Quantity = s.nextDouble();
		double price = rate * Quantity;
		System.out.println("Price for " +Quantity  +itemname +"'s are " +price );
		
		
		
		

	}

}
