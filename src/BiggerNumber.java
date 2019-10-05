import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ENter 3 Numbers");
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		int N3 = s.nextInt();
		
		if (N1 > N2 && N1 > N3)
			System.out.println("N1 " +N1 +" Is Bigger than N2 & N3");
		else 
			if (N2 > N3)
				System.out.println("N2 "+N2 +" Is bigger");
			else
				System.out.println("N3 " +N3 +" Is Bigger");

	}

}
