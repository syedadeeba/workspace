
public class Palindrome {

	public static void main(String[] args) {
		int rem,rev=0,n,num=7887;
		n=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(n==rev)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
