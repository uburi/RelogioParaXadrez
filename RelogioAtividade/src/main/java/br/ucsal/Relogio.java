package br.ucsal;

public class Relogio {
	
    private int tempoMaximo;
    private ContadorTempo jogador1;
    private ContadorTempo jogador2;
    private Thread threadJogador1;
    private Thread threadJogador2;
     
    public Relogio(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
        this.jogador1 = new ContadorTempo(tempoMaximo);
        this.jogador2 = new ContadorTempo(tempoMaximo);
        this.threadJogador1 = new Thread(jogador1);
        this.threadJogador2 = new Thread(jogador2);
    }
    
    public void iniciarTempo() {
        jogador1.iniciarTempo();
        jogador2.iniciarTempo();
        threadJogador1.start();
        threadJogador2.start();
    }
    
    public void pausarTempo() {
        jogador1.pausarTempo();
        jogador2.pausarTempo();
    }
    
    public void reiniciarTempo() {
        jogador1.reiniciarTempo();
        jogador2.reiniciarTempo();
    }
    
    public int getTempoRestanteJogador1() {
        return jogador1.getTempoRestante();
    }
    
    public int getTempoRestanteJogador2() {
        return jogador2.getTempoRestante();
    }
    public int getTempoMaximo() {
        return tempoMaximo;
    }
 

    
}
