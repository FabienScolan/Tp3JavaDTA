import java.util.Arrays;

public class TestArrayTri {
	static int[] arrayT = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int swap;
		int[] arraySort = arrayT;
		for (int i = 0; i < arraySort.length ; i++){
			for (int j = i+1; j < arraySort.length ; j++){
				if (arraySort[i]>arraySort[j]){
					swap = arraySort[i];
					arraySort[i]=arraySort[j];
					arraySort[j]=swap;
				}
			}
		}
		for (int i = 0; i < arraySort.length ; i++){
			System.out.println(arraySort[i]);
		}
		Arrays.sort(arrayT);
		System.out.println("\nTri avec arrays");
		for (int i = 0; i < arraySort.length ; i++){
			System.out.println(arraySort[i]);
		}
	}
	
	
}
