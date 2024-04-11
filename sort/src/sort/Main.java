package sort;

import java.util.Iterator;

public class Main {
	
	
	public static void quicksort(int[] arr, int low, int high ) {
		if(low < high) {
			int pI = partition(arr,low,high);
			
			quicksort(arr,low,pI - 1);
			quicksort(arr, pI + 1,high);	
		}
		
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i     = low - 1;
		
		for (int j = low; j < high; j++) {
			if(arr[j] < pivot ) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i + 1;		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]   = arr[j];
		arr[j]   = temp;
	}
	
	public static void main(String[] args) {
 		int[] arr = {3,1,2,5,6,6,7};
 		quicksort(arr, 0, arr.length -1 );
 		
 		System.out.println("bibble");
 		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}



















