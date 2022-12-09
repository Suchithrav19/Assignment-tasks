package xworkz.com.tasks;
import java.util.*;
public class MergeTwoArray {
	public static void main(String args[])
	{
	int arrayOne[]= {2,4,6,9,1};
	int arrayTwo[]= {3,8,2,7,3};
	int a=arrayOne.length+arrayTwo.length;
	int array[]=new int[a];
    
	for(int i=0;i<arrayOne.length;i++)
	{
		array[i]=arrayOne[i];
				
	}
	for(int j=0;j<arrayTwo.length;j++)
	{
		array[arrayOne.length+j]=arrayTwo[j];
	}
	System.out.println(Arrays.toString(array));
}
}
