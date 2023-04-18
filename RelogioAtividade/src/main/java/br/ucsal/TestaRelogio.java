package br.ucsal;

import java.util.Scanner;

public class TestaRelogio {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int jogadorAtual = 1;
    	boolean parar = true;

        System.out.println("Bem-vindo ao jogo de xadrez!");

        // Criação dos jogadores
        Jogador jogador1 = new Jogador("João", 'A');
        Jogador jogador2 = new Jogador("Maria", 'V');

        // Criação do relógio
        Relogio relogio = new Relogio(10);

        // Criação da partida
        Partida partida = new Partida(jogador1, jogador2, relogio);

        // Início da partida
        partida.iniciarPartida();

        // Loop para permitir que os jogadores fa�am suas jogadas
        while (!partida.isPartidaEncerrada()) {
        	
            if(partida.getNumeroJogadas() == 0) System.out.println("Digite 'jogar' para fazer a primeira jogada ou 'parar' para encerrar seu tempo.");
            else {
            	System.out.println("A partida est� rolando � a vez do jogador: " + jogadorAtual);
            }
            String comando = sc.nextLine();

            if (comando.equals("jogar")) {          	           	
            	if (jogadorAtual == 1) {
                	if(partida.getNumeroJogadas() == 0) relogio.iniciarTempoJogador1();
					jogador1.realizarJogada();
            	}
            	else {
            		if(partida.getNumeroJogadas() == 1) relogio.iniciarTempoJogador2();
            		jogador2.realizarJogada();		
				}
            }
            else if(comando.equals("parar")) {
            	if (jogadorAtual == 1) {
					relogio.pausarTempoJogador1();
					jogadorAtual = 2;
            	}
            	else {
            		relogio.pausarTempoJogador2();		
            		jogadorAtual = 1;
				}
            }
        }

        // Exibição das informações da partida
        System.out.println("A partida terminou!");
        System.out.println("Número de jogadas: " + partida.getNumeroJogadas());
        System.out.println("Hora de início: " + partida.getHoraInicio());
        System.out.println("Hora de fim: " + partida.getHoraFim());
        System.out.println("Tempo gasto por " + jogador1.getNome() + ": " + (relogio.getTempoMaximo() - relogio.getTempoRestanteJogador1()) + " segundos.");
        System.out.println("Tempo gasto por " + jogador2.getNome() + ": " + (relogio.getTempoMaximo() - relogio.getTempoRestanteJogador2()) + " segundos.");
    }

	

}
