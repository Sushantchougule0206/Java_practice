package Day_1;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		int rem=0;
		int reversednum=0;
		
		while (num>0) {
			rem=num%10;
			reversednum=reversednum*10+rem;
			num=num/10;
		}
		System.out.println("Reversed number: "+reversednum);

	}

}
