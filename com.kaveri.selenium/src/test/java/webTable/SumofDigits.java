package webTable;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=124;
		int sum=0;
		while (no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		System.out.println(sum);
	}

}
