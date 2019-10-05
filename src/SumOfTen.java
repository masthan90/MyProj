import java.util.Scanner;

public class SumOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n,i=1,Sum =0;
		while(i<=10)
		{
			System.out.println("Enter Number");
			n = s.nextInt();
			Sum = Sum + n;
			
			i++;
		}
		System.out.println(Sum);
	}

}
