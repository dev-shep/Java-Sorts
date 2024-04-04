package BubleSort;

public class BubbleMain {

	
	public static void bubbleSort(int[] arra) {
		int n = arra.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(arra[j] > arra[ j + 1]) {
					int temp = arra[j];
				    arra[j] = arra[j+1];
				    arra[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {44,654,45,34,656,33,13};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
			
		}
	}

}
