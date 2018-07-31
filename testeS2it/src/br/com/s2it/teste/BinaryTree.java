package br.com.s2it.teste;
/**
* 
* 9 - Considerando a estrutura de uma árvore binária:
* public class BinaryTree {
* int valor;
* BinaryTree left;
* BinaryTree right;
* }
* Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós
* subsequentes.
*/

import java.util.Objects;

public class BinaryTree {
	int valor;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree() {
		super();
	}

	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		super();
		this.valor = valor;
		this.left = left;
		this.right = right;
	}

	/**
	 * retorna valor
	 * 
	 * @return int - número inteiro
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Recebe um número inteiro e o adiciona a váriavel valor
	 * 
	 * @param valor
	 *            - int - número inteiro
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * retorna left do tipo BinaryTree
	 * 
	 * @return BinaryTree
	 */
	public BinaryTree getLeft() {
		return left;
	}

	/**
	 * Recebe uma BinaryTree e adiciona a left
	 * 
	 * @param left
	 *            - BinaryTree
	 */
	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	/**
	 * retorna right do tipo BinaryTree
	 * 
	 * @return BinaryTree
	 */
	public BinaryTree getRight() {
		return right;
	}

	/**
	 * Recebe uma BinaryTree e adiciona a right
	 * 
	 * @param right
	 *            - BinaryTree
	 */
	public void setRight(BinaryTree right) {
		this.right = right;
	}

	/**
	 * @author André Vilhalba - e-mail: andre.vilhalba@gmail.com Recebe uma
	 *         BinaryTree, testa se o objeto é null, se for nul retorna 0 Caso não
	 *         seje null, pega variável valor, e adiciona o resultado da soma dos
	 *         nódulos de left e right e retorna o resultado.
	 * @param bt
	 *            - BinaryTree
	 * @return int - numero inteiro
	 */
	public int somarNos(BinaryTree bt) {
		return Objects.isNull(bt) ? 0 : bt.getValor() + somarNos(bt.getLeft()) + somarNos(bt.getRight());

	}
}
