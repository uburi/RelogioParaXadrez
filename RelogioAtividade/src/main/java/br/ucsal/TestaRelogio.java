package br.ucsal;

public class TestaRelogio {

	public static void main(String[] args) {
		Jogador Joao = new Jogador("João", 'V');
		Jogador Mario = new Jogador("Mario", 'A');

		Relogio Relogio = new Relogio(300);

		Partida Partida = new Partida(Joao, Mario, Relogio);
		Partida.iniciarPartida();
		

	}

}
