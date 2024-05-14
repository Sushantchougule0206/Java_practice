package Day_1;
import java.util.*;
public class sum_of_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		int range= sc.nextInt();
		int even_cnt=0;
		int odd_cnt=0;
		for (int i=1;i<=range;i++) {
			
			if (i%2==0) {
				even_cnt+=i;
			}
			else {
				odd_cnt+=i;
			}
		}
		System.out.println("sum of even number is "+even_cnt);
		System.out.println("sum of odd number is "+odd_cnt);

	}

}
