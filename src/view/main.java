package view;

import java.util.Scanner;
import controller.MultiController;

//Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
// multiplicação de A por B. Os números de entrada devem ser números inteiros.

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MultiController MultiController = new MultiController();
		
		System.out.println("Digite um numero inteiro: ");
		int x = in.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int y = in.nextInt();

		int result = MultiController.multiplicacao(x, y);
		
		System.out.println("O resultado da multiplicacao é: " + result);
		
	}

}
