package webTable;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Changappa";
		String rev = " ";
		for (int i=8;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
		if(rev.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
