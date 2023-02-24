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

  // um vetor constante que guarda todas as palavras de comandos válidas
  //   private static final String[] comandosValidos = { "ir", "sair", "ajuda" };

  // Um hashMap que guarda todas as palavras de comandos válidas
  private HashMap<String, ComandoEnum> comandosValidos = new HashMap<String, ComandoEnum>();

  /**
   * Armazena os comandos validos
   */
  PalavrasComando() {
    for (ComandoEnum comando : ComandoEnum.values()) {
      comandosValidos.put(comando.toString(), comando);
    }
  }

  /**
   * Verifica se uma dada String é uma palavra de comando válida.
   * @return true se a string dada é um comando valido, false se não é.
   */
  public boolean ehComando(String umaString) {
    if (comandosValidos.containsKey(umaString)) {
      return true;
    }
    return false;
  }
}
