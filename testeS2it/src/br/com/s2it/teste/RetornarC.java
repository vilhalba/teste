package br.com.s2it.teste;

/**
 * 
 * @author Andr� Vilhalba e-mail andre.vilhalba@gmail.com
 * @version 1.0
 *
 *
 *          8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C
 *          seguindo as seguintes regras: 
 *          - O primeiro n�mero de C � o primeiro
 *          n�mero de A; 
 *          - O segundo n�mero de C � o primeiro n�mero de B; 
 *          - O terceiro n�mero de C � o segundo n�mero de A; 
 *          - O quarto n�mero de C � o segundo n�mero de B; Assim sucessivamente...
 *          - Caso os n�meros de A ou B sejam de tamanhos diferentes, completar C com o restante dos n�meros do inteiro maior.
 *           Ex: A = 10256, B = 512, C deve ser 15012256. 
 *           - Caso C seja maior que 1.000.000, retornar -1 
 *           Desenvolva um algoritmo que atenda a todos os requisitos acima.
 * 
 */

public class RetornarC {

	/**
	 * M�todo main da classe
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(String.valueOf(valor(10256, 512)));
	}

	/**
	 * M�todo para aplica��o do exerc�cio solicitado 2 n�meros inteiros como
	 * par�metros, onde pegamos de ambos seu n�meros de caracteres; Criamos um index
	 * que representa o maior n�mero de caracteres entre a e b No loop, testamos
	 * enquanto menor que index Primeira parte do loop Se o �ndice do loop for menor
	 * que o n�mero de caracteres do que tamanho de caracteres do primeiro
	 * par�metro, na String criada, adicionamos o caracter, de acordo com o �ndice,
	 * do primeiro par�metro Seguindo, Se o �ndice do loop for menor que o n�mero de
	 * caracteres do que tamanho de caracteres do segundo par�metro, na String
	 * criada, adicionamos o caracter, de acordo com o �ndice, do segundo par�metro
	 * Ao final do loop criamos o numero inteiro C que recebe o resultado da string;
	 * Caso C seja menor 1000000, retornamos o valor de C, caso contr�rio retornamos
	 * -1
	 * 
	 * @param a - n�mero inteiro (tipo int)
	 * @param b - n�mero inteiro (tipo int)
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
