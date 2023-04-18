package br.ucsal;

public class Jogador {
	
    private String nome;
    private char cor;
    private Partida partida;
    private Relogio relogio;
    private int numeroJogadas = 0;
    
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
    public void realizarJogada() {
        numeroJogadas = getNumeroJogadas() + 1;
        if (relogio.getTempoRestanteJogador1() <= 0 || relogio.getTempoRestanteJogador2() <= 0) {
            partida.encerrarPartida();
        }
    }

	public int getNumeroJogadas() {
		return numeroJogadas;
	}

}
