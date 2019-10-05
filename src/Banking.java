import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int amt,bal,ch;
		System.out.println("Enter Current balance");
		bal = s.nextInt();
		do
		{
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.println("ENter You Choice");
			ch = s.nextInt();
			switch(ch)
			{
			
			case 1:
				System.out.println("Enter Amount to Despost");
				amt = s.nextInt();
				bal = bal + amt;
				System.out.println("Current Balance is "+bal);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw");
				amt = s.nextInt();
				if(amt > bal)
					System.out.println("Insufficient funds");
				else
					bal = bal - amt;break;
			case 3:
				System.out.println("Current Balance is "+bal);
				break;
			case 4:
				System.out.println("Thank You For Banking with RBC");
				
			
			}
			
			
		}while(ch != 4);

	}

}

