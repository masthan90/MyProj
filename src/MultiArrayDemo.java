import java.util.Scanner;

public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int[][] n = new int[3][3];
		System.out.println("Enter 9 Values");
		for(int i=0;i<n.length;i++)
			for(int j=0;j<n[i].length;j++)
				n[i][j] = s.nextInt();
		System.out.println("Givent Arrays in 3x3 Matrix");
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
				System.out.print(n[i][j]+" ");
			System.out.println();
			
		}
		
		

	}

}
