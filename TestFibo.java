import java.util.Scanner;

public class TestFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, rang, result = 0;
		a = 0;
		b = 1;
		Scanner questionUser = new Scanner(System.in);
		System.out.println("\nEntrez le rang � laquel vous voulez calculer la suite de Fibonnaci");
		rang = questionUser.nextInt();
		if (rang == 0) {
			System.out.println("\nR�sultat : " + a);
		} else if (rang == 1) {
			System.out.println("\nR�sultat : " + b);
		} else {
			while (rang > 1) {
				result = a + b;
				a = b;
				b = result;
				rang--;
			}
			System.out.println("\nR�sultat : " + result);
		}
		
		questionUser.close();
	}

}
