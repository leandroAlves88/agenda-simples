package Entidades;

import Entidades.enums.TipoNumero;

public class Contato {
	
	Integer idContato;
	String nomeContato;
	String sobreNomeContato;
	String telContato;
	TipoNumero tipoNumero;
	
	public Contato() {
		
	}
	
	
	public Contato(Integer idContato, String nomeContato, String sobreNomeContato, String telContato,
			TipoNumero tipoNumero) {
		super();
		this.idContato = idContato;
		this.nomeContato = nomeContato;
		this.sobreNomeContato = sobreNomeContato;
		this.telContato = telContato;
		this.tipoNumero = tipoNumero;
	}


	public Integer getIdContato() {
		return idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}


	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}


	public String getSobreNomeContato() {
		return sobreNomeContato;
	}


	public void setSobreNomeContato(String sobreNomeContato) {
		this.sobreNomeContato = sobreNomeContato;
	}


	public String getTelContato() {
		return telContato;
	}


	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}


	public TipoNumero getTipoNumero() {
		return tipoNumero;
	}


	public void setTipoNumero(TipoNumero tipoNumero) {
		this.tipoNumero = tipoNumero;
	}
	
	
	public String exibeContato () {
		return "Id "+ this.idContato + " Nome: " +this.nomeContato + " Sobrenome: " +this.sobreNomeContato + " Telefone: "+this.telContato + " Tipo de Telefone: " + this.tipoNumero;
	}
	
	

}
