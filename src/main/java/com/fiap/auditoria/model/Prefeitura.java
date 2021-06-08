package com.fiap.auditoria.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prefeitura implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	private Long id_prefeitura;
	private String nm_prefeitura;
	private String site;
	private String cnpj;
	
	public String getNm_prefeitura() {
		return nm_prefeitura;
	}
	public void setNm_prefeitura(String nm_prefeitura) {
		this.nm_prefeitura = nm_prefeitura;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}