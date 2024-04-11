package BubleSort;

public class BubbleMain2 {

	public static void bubble(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n -i - 1; j++) {
				if(arr[j]  > arr[j+1]) {
					int temp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1] = temp;
				}
			}
		}
	}
	 
	
	public static void quicksort(int[] arr,int low, int high) {
		if(low < high) {
			int pivotIndex = partition(arr,low,high);
			
			quicksort(arr,low,pivotIndex-1);
			quicksort(arr,pivotIndex+1,high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i     = low - 1;
		
		for (int j = low; j < high; j++) {
			if(arr[j]<pivot) {
				i++; 
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
	}
	
	 
	public static void main(String[] args) {
	 int[]arr = {3,4,3,2,1};
	 quicksort(arr,0, arr.length-1);
	 System.out.println("Array");
	 for (int i = 0; i < arr.length-1; i++) {
		 System.out.print(" "+arr[i]);
		
	}
	}

}
