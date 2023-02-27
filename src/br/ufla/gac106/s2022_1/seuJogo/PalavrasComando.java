package br.ufla.gac106.s2022_1.seuJogo;

import java.util.HashMap;

/**
 * Esta classe é parte da aplicação "World of Zuul".
 * "World of Zuul" é um jogo de aventura muito simples, baseado em texto.
 *
 * Essa classe guarda uma enumeração de todos os comandos conhecidos do
 * jogo. Ela é usada no reconhecimento de comandos como eles são digitados.
 *
 * @author  Michael Kölling and David J. Barnes (traduzido e adaptado por Julio César Alves)
 */

public class PalavrasComando {

	// Um hashMap que guarda todas as palavras de comandos válidas
	private HashMap<String, PalavraDeComando> comandosValidos = new HashMap<String, PalavraDeComando>();

	/**
	* Armazena os comandos validos
	*/
	public PalavrasComando() {
		for (PalavraDeComando comando : PalavraDeComando.values()) {
			if (comando != PalavraDeComando.DESCONHECIDA){
				comandosValidos.put(comando.toString(), comando);
			}
		}
	}

	/**
	* Verifica se uma dada String é uma palavra de comando válida.
	* @return true se a string dada é um comando valido, false se não é.
	*/
	public boolean ehComando(String umaString) {
		return comandosValidos.containsKey(umaString);
	}

	public PalavraDeComando obterPalavraDeComando(String palavraDeComando){
		if (comandosValidos.containsKey(palavraDeComando)){
			return comandosValidos.get(palavraDeComando);
		}
		else{
			return PalavraDeComando.DESCONHECIDA;
		}
	}
}
