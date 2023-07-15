package controller;
import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		int base = Teclado.lerInt("Digite um que deseja saber a potencia");/* o número que será
		                                                                      multiplicado por ele
		                                                                      mesmo.
		                                                                   */
		
		int exp = Teclado.lerInt("Digite o expoente");/* exp vai ser a quantidade
		                                                 de voltas que o laço ira dar 
		                                                 para alimentar a variavel pot.
		                                                 */
         /* se a variavel acumuladora for guardar
          * o resultado de uma multiplicação ou divisão
          * ela tem que ser inicializada com 1.
          */
		int pot = 1;// variavel acumuladora.

		for (int i = 1; i <= exp; i++) {
			pot = pot *= base;/* multiplicação
			                  */
			System.out.println(base);
		}//fim do for.
		
		System.out.println(pot);
	}

}
