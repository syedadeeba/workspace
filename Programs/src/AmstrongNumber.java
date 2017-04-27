
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rem,sum=0,n,num=153;
	     n=num;
	     while(num>0)
	     {
	    	 rem=num%10;
	    	 sum=sum+(rem*rem*rem);
	    	 num=num/10;
	     }
	     if(n==sum)
	     {
	    	 System.out.println("armstong number");
	     }
	     else
	    	 System.out.println("not armstrong");
	     
	}

}
