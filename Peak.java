//Lecture 1:- 1D Peak using divide and conquer

package MIT;

import java.util.*;
public class Peak {
	static int peakelement(int arr[],int low, int high,int n) {
		int mid=(low+high)/2;
		//Compare mid with neighbors if they exist
		//Check if the first and last elements are peak
		if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]))
			return mid;
		else if(mid>0&&arr[mid-1]>arr[mid])//Left half
			return peakelement(arr,low,(mid-1),n);
		else //Right half
			return peakelement(arr,(mid+1),high,n);		
	}
	static int findpeak(int arr[],int n) {
		return peakelement(arr,0,n-1,n);
	}
	public static void main(String[]args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the size of the elements");
		int size=c.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
			array[i]=c.nextInt();
		System.out.println("The index of the peak element is "+findpeak(array,size));
	}
}
