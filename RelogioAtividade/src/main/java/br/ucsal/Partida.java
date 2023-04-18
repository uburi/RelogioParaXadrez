package br.ucsal;

import java.time.LocalDateTime;

public class Partida {
    private Jogador jogador1;
    private Jogador jogador2;
    private Relogio relogio;
    private int numeroJogadas;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFim;
    private boolean partidaEncerrada;
    private boolean vezJogador1 = true;
    private Jogador atual;

	public Partida(Jogador jogador1, Jogador jogador2, Relogio relogio) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.relogio = relogio;
		this.numeroJogadas = 0;
	}

	public void incrementaNumeroJogadas() {
		numeroJogadas++;
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public Relogio getRelogio() {
		return relogio;
	}

	public int getNumeroJogadas() {
		return numeroJogadas;
	}
	public void iniciarPartida() {
        relogio.iniciarTempoJogador1();
        horaInicio = LocalDateTime.now();
        partidaEncerrada = false;
    }
 
    
    public void encerrarPartida() {
        relogio.pausarTempo();
        horaFim = LocalDateTime.now();
        partidaEncerrada = true;
    }
    
    public boolean isPartidaEncerrada() {
        return partidaEncerrada;
    }
    
    
    public void setNumeroJogadas(int numeroJogadas) {
		this.numeroJogadas = numeroJogadas;
	}

	public LocalDateTime getHoraInicio() {
        return horaInicio;
    }
    
    public LocalDateTime getHoraFim() {
        return horaFim;
    }
    
    public int getTempoGastoJogador1() {
        return relogio.getTempoMaximo() - relogio.getTempoRestanteJogador1();
    }
    
    public int getTempoGastoJogador2() {
        return relogio.getTempoMaximo() - relogio.getTempoRestanteJogador2();
    }
}
