package Day_1;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		if (isplindrome(number))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
	}
	
	public static boolean isplindrome(int num) {
		
		String original = Integer.toString(num);
		
		String reversed = new StringBuilder(original).reverse().toString();
		
		return original.equals(reversed);
		
	}

}
