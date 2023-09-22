package Besic_java_assignments;

import java.util.Scanner;

public class Assignment__task_9 {

	public static void main(String[] args) {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number counts");
		int count=sc.nextInt();
		double number[]=new double[count];
		int count_2=0;
		System.out.println("Please enter the numbers here");
		for(int i=0;i<number.length;i++)
		{System.out.println("number"+i+"= ");
		number[i]=sc.nextDouble();
		
		if(number[i]==85){   
			break;	
		}
		//to check the break point i use additional variable count_2
		count_2++;
		
	}
		System.out.println(count_2);

	}

}
