//Lecture 03:- Insertion Sort

package MIT;

public class Insert {
	public void sort(int arr[],int n) {
		n=arr.length;
		int key;
		for(int j=1;j<n;j++) {
			key=arr[j];
		 	// Insert arr[j] into the sorted sequence arr[1..j-1]
			int i=j-1;	//Used to point to the index of the element left of the key
			while(i>-1&&arr[i]>key) {	//2nd condition tests if the element on the left of key is greater than it or not
				arr[i+1]=arr[i];	//The element to the right of the key is updated to arr[i+1]
				i=i-1;	//Traverse the array of right to left and check while's condition
			}
			arr[i+1]=key;	// insert key between two elements, i.e in it's right place	
		}
		for(int j=0;j<n;j++)
            System.out.println(arr[j]);
	}
	public static void main(String[]args) {
		Insert obj=new Insert();
		int array[]= {34,5,19,10,85,26};
		int s=array.length;
		obj.sort(array, s);
	}
}
