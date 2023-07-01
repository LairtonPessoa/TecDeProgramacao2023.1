package com.IlhaDeJava.Model;

import javax.swing.ImageIcon;


public abstract class Entidade  {

	protected String nome;
	private int posicaoXdaEntidade;
	private int posicaoYdaEntidade;
	private Plano plano;
	private ImageIcon iconeDaEntidade;
	private TipoDaEntidade tipo;
	
	public Entidade(TipoDaEntidade tipo, int posX, int posY, ImageIcon icon, Plano plano) {
		this.tipo=tipo;
		this.posicaoXdaEntidade=posX;
		this.posicaoYdaEntidade=posY;
		this.iconeDaEntidade=icon;
		this.plano = plano;
	}

	public int getPosicaoXdaEntidade() {
		return posicaoXdaEntidade;
	}

	public void setPosicaoXdaEntidade(int posicaoXdaEntidade) {
		this.posicaoXdaEntidade = posicaoXdaEntidade;
	}

	public int getPosicaoYdaEntidade() {
		return posicaoYdaEntidade;
	}

	public void setPosicaoYdaEntidade(int posicaoYdaEntidade) {
		this.posicaoYdaEntidade = posicaoYdaEntidade;
	}

	public String getNome() {
		return nome;
	}

	

	public ImageIcon getIconeDaEntidade() {
		return iconeDaEntidade;
	}
	
	public TipoDaEntidade getTipo() {
		return tipo;
	}

	public Celula getCelulaAtualDaEntidade() {
		for (Celula celula : plano.getCelulas()) {
			if(celula.getPosX()==posicaoXdaEntidade&&celula.getPosY()==posicaoYdaEntidade) {
				return celula;
			}
		}
		return null;
	}

	public void atribuirEntidadeACelula() {
		for (Celula celula : plano.getCelulas()) {//for para verificarmos do inicio de todas as celulas
			if(celula.getPosX()==this.posicaoXdaEntidade&&celula.getPosY()==this.posicaoYdaEntidade) {//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas da entidade e atribuimos ela na celula correspondente
				celula.getEntidades().add(this);
			}else {//se a minha celula não tiver as mesmas posições da entidade e tiver a entidade, ira remove-la
				celula.getEntidades().remove(this);
			}
		}
	}
	
	
}
