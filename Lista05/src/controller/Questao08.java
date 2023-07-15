package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		String nome, sexo;
		int idade;
		for (int i = 1; i <= 2; i++) {

			nome = Teclado.lerTexto("Digite seu nome completo");
			sexo = Teclado.lerTexto("Digite( M ) para sexo Masculino ou ( F ) para sexo Femenino");
			idade = Teclado.lerInt("Digite sua idade");

			if ((sexo.equals("M")) && (idade > 20)) {/*
														 * Para filtrar String tenho que usar equals.
														 */
				System.out.println();
				System.out.println(nome + " do sexo " + sexo + " tem " + idade + " anos ");
				System.out.println();
			} // fim do for

		}

	}

}
