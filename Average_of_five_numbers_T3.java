package Besic_java_assignments;

import java.util.Scanner;

public class Average_of_five_numbers_T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Avr=0;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number counts");
		int count=sc.nextInt();
		for(int i=0; i<count;i++)
		{
			System.out.println("Enter the "+i+" number here for everage:");
			double number=sc.nextDouble();
			sum=sum+number;
			
			
			
		}
		Avr=sum/count;
		System.out.println("Average of given five numbers are:"+Avr);

	}

}
