import java.util.Scanner;

public class TestFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,rang,result = 0;
		a=0;
		b=1;
		Scanner questionUser = new Scanner(System.in);
		System.out.println("\nEntrez le rang à laquel vous voulez calculer la suite de Fibonnaci");
		rang = questionUser.nextInt();
		while(rang>0){
			result = a+b;
			a = b;
			b=result;
			rang--;
		}
		System.out.println("\nRésultat : " + result);
		questionUser.close();
	}

}
