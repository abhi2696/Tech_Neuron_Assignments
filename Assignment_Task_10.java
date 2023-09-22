package Besic_java_assignments;

import java.util.Scanner;

public class Assignment_Task_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the words counts");
		int count=sc.nextInt();
		String words[]=new String [count];
		int count_2=0;
		System.out.println("Please enter the words here");
		for(int i=0;i<words.length;i++)
		{System.out.println("word"+i+"= ");
		words[i]=sc.next().toLowerCase();
		
		if(words[i].equals("selenium")){   
			break;	
		}
		// to check the break point i use additional variable count_2
		count_2++;
		
	}
		System.out.println(count_2);


	}

}
