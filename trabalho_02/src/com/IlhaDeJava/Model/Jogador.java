package com.IlhaDeJava.Model;

public class Jogador {

	private String nome;
	private int pontuacaoDoJogador;
	private int rodadas;
	
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public int getPontuacaoDoJogador() {
		return pontuacaoDoJogador;
	}

	public void setPontuacaoDoJogador(int pontuacaoDoJogador) {
		this.pontuacaoDoJogador = pontuacaoDoJogador;
	}

	public int getRodadas() {
		return rodadas;
	}

	public void setRodadas(int rodadas) {
		this.rodadas = rodadas;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
