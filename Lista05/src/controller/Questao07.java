package controller;

public class Questao07 {

	public static void main(String[] args) {

		 /* se a variavel acumuladora for guardar
         * o resultado de uma adição ou subtração
         * ela tem que ser inicializada com 0.
         */
		int soma = 0; // variavel acumuladora.

		for (int i = 3; i <= 21; i++) {

			if (i % 2 == 0) {// só vai entra nesse laço do if os números pares.

				soma += i; /*
							 * soma esta recebendo valor da soma que inicialmente é 0 + o valor de i que é o
							 * proximo numero par no caso o 4 ela ira fazer isso ate o numero 21. Ex: 0+4= 4
							 * soma vale 4, 4+6= 10 soma vale 10.
							 */
			} // fim do if.

		} // fim do for.

		System.out.println(soma);//Resposta.
	}
}
