
public class TestArray2 {
	static int[] arrayT = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//moyenne
		float moyenne = 0;
		for (int i = 0; i < arrayT.length ; i++){
			moyenne = moyenne + arrayT[i];	
		}
		moyenne = moyenne/arrayT.length;
		System.out.println("Moyenne : " + moyenne);
	
		System.out.println("15 ème element : " + arrayT[14]);
		for (int i = 0; i < arrayT.length ; i++){
			for (int j = i+1; j < arrayT.length ; j++){
				if (arrayT[i]==arrayT[j]) System.out.println("Doublon trouvé : " + arrayT[i]);
			}
		}
	}
}
