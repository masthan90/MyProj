
public class Welcome {
	
	int m;//data member
	   void xxx()
	   {
		int n=9;//local variable
		n *= 10;
		System.out.println(n);//Error - local variable n should be initialized
            }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome Masthan");
		Welcome s = new Welcome();
		System.out.println(s.m);//0
		s.xxx();
		//test
	}

}
