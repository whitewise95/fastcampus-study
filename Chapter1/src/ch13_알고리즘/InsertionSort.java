package ch13_알고리즘;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = {50,20,10,60,90,40,70,80,30};
		
		int i =0; int j =0;
		int temp = 0;
		
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while((j> 0)&& (temp < arr[j-1])) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
		
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+", ");
		}

	}

}
