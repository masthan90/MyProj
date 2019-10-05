import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		int sum = 0;
		int n[] = new int[size];
		System.out.println("Enter " +size +" values");
		for(int i =0; i<n.length;i++) 
			n[i] = s.nextInt();
		System.out.println("Given Array Elemnts");
		for(int i =0; i<n.length;i++) {
		System.out.println(n[i]);
		sum = sum + n[i];
		
		}
		
		System.out.println("Sum of array elements is "+sum);

	}

}
