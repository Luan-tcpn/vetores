package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int achado, prova = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			num[i] = leia.nextInt();
		}

		System.out.println("Digite o numero que você quer achar");
		achado = leia.nextInt();

		for (int i = 0; i < 10; i++) {
			if (achado == num[i]) {
				System.out.println("O numero " + achado + " está localizado na posição " + num[i]);
				prova++;
			}
		}

		if (prova == 0) {
			System.out.println("O numero " + achado + " não foi encontrado!");
		}

	}

}
