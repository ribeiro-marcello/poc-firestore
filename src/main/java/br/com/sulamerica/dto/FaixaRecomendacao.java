package br.com.sulamerica.dto;

import java.io.Serializable;

public class FaixaRecomendacao implements Serializable {

	private static final long serialVersionUID = 5279319555191983149L;

	private String id;
	
	private String sexo;

	private String faixaEtaria;

	private String nomeFantasiaPrestador;

	private String codigoPrestador;

	private String codigoExame;

	private Long valorSinistro;

	private Long sinistroPorOrganizacao;

	private Double sinistroPorExame;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getNomeFantasiaPrestador() {
		return nomeFantasiaPrestador;
	}

	public void setNomeFantasiaPrestador(String nomeFantasiaPrestador) {
		this.nomeFantasiaPrestador = nomeFantasiaPrestador;
	}

	public String getCodigoPrestador() {
		return codigoPrestador;
	}

	public void setCodigoPrestador(String codigoPrestador) {
		this.codigoPrestador = codigoPrestador;
	}

	public String getCodigoExame() {
		return codigoExame;
	}

	public void setCodigoExame(String codigoExame) {
		this.codigoExame = codigoExame;
	}

	public Long getValorSinistro() {
		return valorSinistro;
	}

	public void setValorSinistro(Long valorSinistro) {
		this.valorSinistro = valorSinistro;
	}

	public Long getSinistroPorOrganizacao() {
		return sinistroPorOrganizacao;
	}

	public void setSinistroPorOrganizacao(Long sinistroPorOrganizacao) {
		this.sinistroPorOrganizacao = sinistroPorOrganizacao;
	}

	public Double getSinistroPorExame() {
		return sinistroPorExame;
	}

	public void setSinistroPorExame(Double sinistroPorExame) {
		this.sinistroPorExame = sinistroPorExame;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
