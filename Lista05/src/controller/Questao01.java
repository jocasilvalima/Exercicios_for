package controller; //GbP

public class Questao01 {

	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 1000 a 1500.
	 */

	public static void main(String[] args) {

		for (int i = 1000; i <= 1500; i++) {

			if (i % 2 != 0) {
				System.out.println("numeros ípares entre 1000 e 1500 " + i);
			}

		}
	}
}
