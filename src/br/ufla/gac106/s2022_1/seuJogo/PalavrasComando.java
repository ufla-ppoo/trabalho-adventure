package br.ufla.gac106.s2022_1.seuJogo;

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
    // um enum constante que guarda todos os comandos validos
    private enum comandosValidos{
            ir,
            sair,
            ajuda
    }

    /**
     * Verifica se uma dada String é uma palavra de comando válida. 
     * @return true se a string dada é um comando valido, false se não é.
     */
    public boolean ehComando(String umaString) {
        for (comandosValidos comando : comandosValidos.values()) {
            if(comando.toString().equals(umaString))
                return true;
        }
        
        // se chegamos aqui, a string não foi encontrada nos comandos.
        return false;
    }
}