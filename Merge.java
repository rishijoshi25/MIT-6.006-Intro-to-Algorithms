//Lecture 03:-Merge Sort

package MIT;

public class Merge {
	public void merge(int arr[],int left,int middle,int right) {
		
		//Find the sizes of two subarrays to be merged
		int n1=middle-left+1;
		int n2=right-middle;
		
		//Create temp arrays
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//Copy data to temp arrays
		for(int i=0;i<n1;++i)
			L[i]=arr[left+i];
		for(int j=0;j<n2;++j)
			R[j]=arr[middle+1+j];
		
		//Merge the temp arrays
	
		int i=0,j=0;	//Initial indexes of 1st and 2nd subarrays
		int k=left;	//Initial index of merged subarray
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elements of L and R if any
		 while (i<n1) {
			 arr[k]=L[i];
	         i++;
	         k++;
		 }
		 while(j<n2) {
			 arr[k]=R[j];
			 j++;
			 k++;
		 } 
	}
	
	public void sort(int arr[],int left,int right) {
		if(left<right) {
			int middle=(left+right)/2;
			sort(arr,left,middle);	//Sort 1st half
			sort(arr,middle+1,right);	//Sort 2nd half
			merge(arr,left,middle,right);	//Merge the sorted arrays
		}
	}
	static void display(int arr[]) {
		int s=arr.length;
		for(int i=0;i<s;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[]args) {
		Merge obj=new Merge();
		int array[]= {45,12,34,28,56,19,2,11,88};
		obj.sort(array,0,array.length-1);
		display(array);
	}
}
