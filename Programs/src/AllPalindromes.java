
public class AllPalindromes {
	public static void main(String[] args){
		int num,rem,rev=0;
		for(int i=100;i>1000;i++)
		{
			num=i;
			while(num>0)
			{
				rem=num%10;
				rev=(rev*10)+rem;
				num=num/10;
			}
			if(i==rev)
			{
				System.out.println(i);
			}
		}
	}
	

}
