//Lecture 04:- Heap Sort

package MIT;

public class Heap {
	public void build_max_heap(int arr[]) {
		int n=arr.length;
		for(int i=n/2-1; i>=0;i--)
			max_heapify(arr,n,i);
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			max_heapify(arr,i,0);
		}
	}
	public void max_heapify(int arr[],int n,int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
			largest=right;
		if(largest!=i) {	// If largest is not root
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			max_heapify(arr,n,largest);
		}
	}
	public void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[]args) {
		int arr[]= {45,12,3,78,23,90,55,33,10};
		Heap obj=new Heap();
		obj.build_max_heap(arr);
		obj.print(arr);
	}
}
