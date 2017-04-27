
public class SumofNumbers {

	public static void main(String[] args) {
		int num=2346,rem,sum=0;
		 while(num>0)
		 {
			 rem=num%10;
			 sum=sum+rem;
			 num=num/10;
		 }
		 System.out.println("sum of number is:"+sum);
	}

}
