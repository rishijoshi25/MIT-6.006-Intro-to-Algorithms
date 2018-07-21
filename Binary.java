//Lecture 01:-Binary Search using divide and conquer
package MIT;

import java.util.*;
public class Binary {
	int search(int arr[],int left,int right,int x) {
		if(right>=1) {
			int mid=(left+right)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)	//Left half
				return search(arr,left,(mid-1),x);
			else	//Right half
				return search(arr,(mid+1),right,x);
		}
		return -1;	//Not present
	}
	public static void main(String[]args) {
		Binary ob=new Binary();
		int n,s,res;
		int array[]=new int[100];
		Scanner c=new Scanner(System.in);
		System.out.println("Enter size");
		n=c.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			array[i]=c.nextInt();
		System.out.println("Enter element to search");
		s=c.nextInt();
		res=ob.search(array,0,n-1,s);
		if (res==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
	}
}
