import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length");
		int lenght = s.nextInt();
		System.out.println("Enter Breadth");
		int breadth = s.nextInt();
		int area = lenght*breadth;
		System.out.println("Area is " +area);
		
		

	}

}
