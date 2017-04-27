import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		int year;
		System.out.println("enter year");
		   Scanner s=new Scanner(System.in);
		   year = s.nextInt();
	   if(year%4==0)
		   System.out.println("entered year is leap year");
	   else
		   System.out.println("entered year is not leap year");

	}

}
