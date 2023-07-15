package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Desenvolver um programa que pergunte um número inteiro e exiba os números que
	 * são, ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número
	 * informado pelo usuário.
	 */

	public static void main(String[] args) {

		int res3 = 0, res5 = 0, num = Teclado.lerInt("Digite um número");

		for (int i = 1; i <= num; i++) {
			res3 = i % 3;
			 res5 = i % 5;
			 
			 if ((res3 == 0) && (res5 == 0)) {
				 System.out.println(i + " é múltiplo de 3 e 5 ao mesmo tempo ");
				 
			 }
			
		}
	}

}
