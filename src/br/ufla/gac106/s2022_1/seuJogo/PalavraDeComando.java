package br.ufla.gac106.s2022_1.seuJogo;

/**
 * Representações de todas as palavras de comandos validas para o jogo.
 *
 * @author Michael Kölling and David J. Barnes
 */

public enum PalavraDeComando {
	// Um valor de cada palavra de comando
	// juntamente com sua string correspondente da interface com o usuário.
	IR("ir"), SAIR("sair"), AJUDA("ajuda"), DESCONHECIDA("?");

	// Palavra de comando
	private String palavraDeComando;

	/**
	* Inicializa com a palavra de comando correspondente
	* @param palavraDeComando a palavra de comando
	*/
	PalavraDeComando(String palavraDeComando) {
		this.palavraDeComando = palavraDeComando;
	}

	/**
	* @return A palavra de comando como uma string
	*/
	public String toString() {
		return palavraDeComando;
	}
}
