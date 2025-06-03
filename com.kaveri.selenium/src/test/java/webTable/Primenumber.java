package webTable;

public class Primenumber {
	//public static void prime(int num)

	public static void main(String[] args) {
		int num=2;
		// TODO Auto-generated method stub
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		}

	}

}
