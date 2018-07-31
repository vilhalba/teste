package br.com.s2it.teste;

/**
 * 
 * @author André Vilhalba e-mail andre.vilhalba@gmail.com
 * @version 1.0
 *
 *
 *          8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C
 *          seguindo as seguintes regras: 
 *          - O primeiro número de C é o primeiro
 *          número de A; 
 *          - O segundo número de C é o primeiro número de B; 
 *          - O terceiro número de C é o segundo número de A; 
 *          - O quarto número de C é o segundo número de B; Assim sucessivamente...
 *          - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior.
 *           Ex: A = 10256, B = 512, C deve ser 15012256. 
 *           - Caso C seja maior que 1.000.000, retornar -1 
 *           Desenvolva um algoritmo que atenda a todos os requisitos acima.
 * 
 */

public class RetornarC {

	/**
	 * Método main da classe
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(String.valueOf(valor(10256, 512)));
	}

	/**
	 * Método para aplicação do exercício solicitado 2 números inteiros como
	 * parâmetros, onde pegamos de ambos seu números de caracteres; Criamos um index
	 * que representa o maior número de caracteres entre a e b No loop, testamos
	 * enquanto menor que index Primeira parte do loop Se o índice do loop for menor
	 * que o número de caracteres do que tamanho de caracteres do primeiro
	 * parâmetro, na String criada, adicionamos o caracter, de acordo com o índice,
	 * do primeiro parâmetro Seguindo, Se o índice do loop for menor que o número de
	 * caracteres do que tamanho de caracteres do segundo parâmetro, na String
	 * criada, adicionamos o caracter, de acordo com o índice, do segundo parâmetro
	 * Ao final do loop criamos o numero inteiro C que recebe o resultado da string;
	 * Caso C seja menor 1000000, retornamos o valor de C, caso contrário retornamos
	 * -1
	 * 
	 * @param a - número inteiro (tipo int)
	 * @param b - número inteiro (tipo int)
	 * @return c - numero inteiro
	 */
	public static int valor(int a, int b) {
		StringBuilder sb = new StringBuilder();
		int tamanhoA = String.valueOf(a).length();
		int tamanhoB = String.valueOf(b).length();
		int index = tamanhoA >= tamanhoB ? tamanhoA : tamanhoB;

		for (int i = 0; i < index; i++) {
			if (i < tamanhoA)
				sb.append(String.valueOf(a).charAt(i));
			if (i < tamanhoB)
				sb.append(String.valueOf(b).charAt(i));
		}
		int c = Integer.parseInt(sb.toString());

		return c < 1000000 ? c : -1;
	}

}
