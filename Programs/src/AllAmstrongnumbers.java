
public class AllAmstrongnumbers {

	public static void main(String[] args) {
		int num,rem,sum=0;
		   for(int i=100;i<=500;i++)
		   {
			   num=i;
			   while(num>0)
			   {
				   rem=num%10;
				   sum=sum+(rem*rem*rem);
				   num=num/10;
			   }
			   if(sum==i)
			   {
				   System.out.println(+i);
			   }
			   sum=0;
		   }
	}

}
