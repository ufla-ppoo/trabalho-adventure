package br.ufla.gac106.s2022_1.seuJogo;

/**
 * Representações de todas as palavras de comandos validas para o jogo.
 *
 * @author Michael Kölling and David J. Barnes
 */

public enum ComandoEnum {
  // Um valor de cada palavra de comando
  // juntamente com sua string correspondente da interface com o usuário.
  IR("ir"),
  SAIR("sair"),
  AJUDA("ajuda");

  // Palavra de comando
  private String comandoEnum;

  /**
   * Inicializa com a palavra de comando correspondente
   * @param comandoEnum a palavra de comando
   */
  ComandoEnum(String comandoEnum) {
    this.comandoEnum = comandoEnum;
  }

  /**
   * @return A palavra de comando como uma string
   */
  public String toString() {
    return comandoEnum;
  }
}
