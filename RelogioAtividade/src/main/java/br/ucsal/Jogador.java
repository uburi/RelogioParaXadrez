package br.ucsal;

public class Jogador {
	
    private String nome;
    private char cor;
    
    public Jogador(String nome, char cor) {
        this.nome = nome;
        this.cor = cor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public char getCor() {
        return cor;
    }

}
