
public class TestArray1 {

	static int[] arrayT = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	
	public static void main(String[] args){
		int i;
		//consigne 1
		for (i = 0; i < arrayT.length ; i++){
			System.out.println(arrayT[i]);
		}
		//consigne 2 loop inverse
		for (i = arrayT.length - 1; i>=0 ; i--){
			System.out.println(arrayT[i]);
		}
		//test >3
		for  (i = 0; i < arrayT.length ; i++){
			if (arrayT[i]>3) System.out.println(arrayT[i]);
		}
		//test pair
		for  (i = 0; i < arrayT.length ; i++){
			if (arrayT[i]%2==0) System.out.println(arrayT[i]);
		}
		//test + grand
		int leplusgrand= arrayT[0];
		for  (i = 1; i < arrayT.length ; i++){
			if (arrayT[i]>leplusgrand) leplusgrand=arrayT[i];
		}
		System.out.println("Nombre le plus grand : " + leplusgrand);
		int lepluspetit= arrayT[0];
		for  (i = 1; i < arrayT.length ; i++){
			if (arrayT[i]<lepluspetit) lepluspetit=arrayT[i];
		}
		System.out.println("Nombre le plus petit : " + lepluspetit);
	}
}
