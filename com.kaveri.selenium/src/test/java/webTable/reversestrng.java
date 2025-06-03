package webTable;

public class reversestrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Changappa";
		String rev = " ";
		for (int i=8;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
			System.out.println(rev);
	}

}
