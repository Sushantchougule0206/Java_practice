package Day_1;
import java.util.*;
public class prime_nonprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		num=sc.nextInt();
		System.out.println(num/2);
		
		int flag=1;
		for (int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				flag=0;
				break;
			}
			else {
				flag=1;
			}
		}
		System.out.println(flag);
        if (flag==1)
        	 System.out.println("Prime");
        else
        	 System.out.println("Not Prime");
	}

}
