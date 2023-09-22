package Besic_java_assignments;
import java.util.*;
public class Prime_number_T6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number here");
		int number=sc.nextInt();
		int flag=0;
		for(int i=2;i<=number/2;i++)
		{   if(number%i==0)
		{
			flag++;
			break;
		}
		
		}
		if(flag==1)
		{
			System.out.println("Given number is not a prime number");
		}
		else
		{
			System.out.println("Given number is a prime number");
		}
		
	}

}
