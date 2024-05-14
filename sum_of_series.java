package Day_1;
import java.util.*;
public class sum_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		
		for (int i=1;i<num+1;i++) {
			sum+=i;
		}
		System.out.println("sum of series is "+sum);
	}

}
