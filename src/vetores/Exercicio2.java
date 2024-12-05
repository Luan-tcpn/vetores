package vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int soma = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			num[i] = leia.nextInt();

		}
		for (int i = 1; i< 10; i=i+2) {
			System.out.println("Elemento no indice impar: " + num[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("Elemento par: " + num[i]);
			}
		}
		for (int i = 0; i < 10; i++) {
			soma += num[i];
		}
		System.out.println("A soma de todos os valores nos vetores é: " + soma);
		System.out.println("A media de todos os valores nos vetores é: " + soma/10);
	

	}

}
