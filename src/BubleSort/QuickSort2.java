package BubleSort;

public class QuickSort2 {

	public static void quicksort(int[] arr) {
		quicksort(arr, 0 , arr.length - 1);
	}
	
	public static void quicksort(int[] arr, int low , int high) {
		if(low < high) {
			int pivotIndex = partition(arr, low , high);
			quicksort(arr, low , pivotIndex - 1);
			quicksort(arr, pivotIndex + 1 , high);
		}
	}
	
	public static int partition(int[] arr, int low , int high) {
		int pivot = arr[high];
		int      i = low - 1;
		
		for (int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
				
			}
		}
		
		swap(arr, i + 1,high);
		return i+1;
		
	}
	
	public static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i]   = arr[j];
		arr[j]   = temp;
	}
	
    // Método principal para probar el algoritmo Quicksort
    public static void main(String[] args) {
    	int[] arr = {32,23,1,23,43,12,23,43};
    	quicksort(arr);
    	System.out.println("Quicksort");
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
    }
}

