package controller;
import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		int base = Teclado.lerInt("Digite um que deseja saber a potencia");
		int exp = Teclado.lerInt("Digite o expoente");

		int pot = 1;

		for (int i = 1; i <= exp; i++) {
			pot = pot *= base;
		}
		System.out.println(pot);
	}

}
