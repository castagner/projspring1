package br.com.projspringok.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String tipoJogo;
	private int qtdJogadores;
	private int dataJogo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoJogo() {
		return tipoJogo;
	}
	public void setTipoJogo(String tipoJogo) {
		this.tipoJogo = tipoJogo;
	}
	public int getQtdJogadores() {
		return qtdJogadores;
	}
	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	}
	public int getDataJogo() {
		return dataJogo;
	}
	public void setDataJogo(int dataJogo) {
		this.dataJogo = dataJogo;
	}
	

}
