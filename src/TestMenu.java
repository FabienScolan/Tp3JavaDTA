import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int index = 0;
		int[] tableau = new int[5];
		Scanner questionUser = new Scanner(System.in);
		System.out.println("\nEntrez votre option (1 pour ajouter nombre, 2 pour voir tableau, 3 pour quitter) : ");
		a = questionUser.nextInt();
		while (a != 3) {
			switch (a) {
			case 1:
				System.out.println("\nEntrez votre nombre");
				tableau[index] = questionUser.nextInt();
				index++;
				if (index >= tableau.length){
					System.out.println("\nAgrandissement tableau");
					int[] newtab = new int[tableau.length+5];
					for (int i = 0; i < index; i++) {
						newtab[i] = tableau[i];
					}
					tableau = newtab;
				}
				break;

			case 2:
				for (int i = 0; i < index; i++) {
					System.out.println(tableau[i]);
				}
				break;

			}
			System.out.println("\nEntrez votre option (1,2 ou 3) : ");
			a = questionUser.nextInt();
		}
		questionUser.close();
	}

}
