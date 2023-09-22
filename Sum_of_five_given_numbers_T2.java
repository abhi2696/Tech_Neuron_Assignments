package Besic_java_assignments;

import java.util.Scanner;

public class Sum_of_five_given_numbers_T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
			System.out.println("Enter the "+i+" number here:");
			double number=sc.nextDouble();
			sum=sum+number;
			
		}
		System.out.println("Sum of given five numbers are:"+sum);
	}

}
