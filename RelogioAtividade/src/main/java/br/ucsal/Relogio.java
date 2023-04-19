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
    }
    
    public void iniciarTempoJogador1() {
        this.threadJogador1 = new Thread(this.jogador1);
        jogador1.iniciarTempo();   
        if (!threadJogador1.isAlive()) {
        	threadJogador1.start();
        }
    }
    public void iniciarTempoJogador2() {
        this.threadJogador2 = new Thread(this.jogador2);
        jogador2.iniciarTempo();
        if (!threadJogador2.isAlive()) {
        	threadJogador2.start();
        }
    }
    public void pausarTempoJogador1() {
        jogador1.pausarTempo();
        jogador2.setPausado(false);
    }
    public void pausarTempoJogador2() {
        jogador2.pausarTempo();
        jogador1.setPausado(false);
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
