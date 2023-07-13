package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número qualquer informado pelo usuário.
	 */

	public static void main(String[] args) {

		int num = Teclado.lerInt("Digite um numero para saber a tabuada dele");
		System.out.println("_______________________");
		for (int i = 0; i <= 10; i++) {
			int mul = num * i;
			System.out.println(num + " X " + i + " = " + mul);
		}
		System.out.println("_______________________");
		for (int i = 0; i <= 10; i++) {
			double num1 = num;
			double div = num1 / i;
			System.out.println(num1 + " / " + i + " = " + div);
		}
		System.out.println("_______________________");
		for (int i = 0; i <= 10; i++) {
			int som = num + i;
			System.out.println(num + " + " + i + " = " + som);
		}
		System.out.println("_______________________");
		for (int i = 0; i <= 10; i++) {
			int sub = num - i;
			System.out.println(num + " - " + i + " = " + sub);
		}
		System.out.println("_______________________");
	}

}
