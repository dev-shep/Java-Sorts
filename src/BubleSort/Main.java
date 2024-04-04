package BubleSort;

public class Main {

	public static void bubble(int[] arr) {
		int n  = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n- i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = temp;
				}
			}			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,23,2,1,5,6,7};
		bubble(arr);
		System.out.println("Bubble");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}