package controller;//GbP

import util.Teclado;

public class Questao02 {

	/*Desenvolver um programa que apresente o total da soma de n números 
	 * inteiros do número 1 até n, onde n é um valor informado pelo usuário. 
	 */
	
	public static void main(String[] args) {
		
		int n = Teclado.lerInt("Digite um número");
		int soma =0;
		for(int i = 1; i <= n; i++) {
			soma +=i;	
		}
		System.out.println("A soma é " + soma);

	}

}
