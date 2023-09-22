package Besic_java_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1_Task_8 {
	public static void main(String[] args) {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of Students");
		int count=sc.nextInt();
		double students[]=new double[count];
		int count_2=0;
		System.out.println("Please enter the student marks here");
		for(int i=0;i<students.length;i++)
		{System.out.println("student"+i+"= ");
		students[i]=sc.nextDouble();
		
		if(students[i]>=80){   
			count_2++;	
		}
		
	}
		double best_students_marks[]=new double[count_2];
		
		for(int k=0;k<students.length; k++)
		{
			if(students[k]>=80)
			{  for(int i=0;i<best_students_marks.length;i++)
				best_students_marks[i]=students[k];
			}
		}
		System.out.println(Arrays.toString(best_students_marks));
	
	}
	

}
