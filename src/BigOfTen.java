import java.util.Scanner;

public class BigOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n,i=1,big =0;
		while(i<=10)
		{
			System.out.println("Enter a Number");
			n = s.nextInt();
			if(n>big)
				big = n;
			i++;

	}
		System.out.println("Biggest is "+big);
	}

}
