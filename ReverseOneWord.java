package xworkz.com.tasks;

import java.util.Scanner;

public class ReverseOneWord
{
	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		String word=sc.next();
		
		String rev="";
		
		String[] str=a.split(" ");
		
		
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(word)) 
			{
				char ch[]=word.toCharArray();
				
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+ch[j];
				}
					str[i]=rev;
				}
			}
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
			}
		
		//System.out.println(rev);
	}
}
			

