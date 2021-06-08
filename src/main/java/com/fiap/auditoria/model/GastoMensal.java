package com.fiap.auditoria.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GastoMensal {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	private Long id_gasto_mensal;
	private double vl_gasto;
	private Date ano_mes_vigencia;
	private Date dt_insercao;
	private boolean ativo;
	
	
	public Long getId_gasto_mensal() {
		return id_gasto_mensal;
	}
	public void setId_gasto_mensal(Long id_gasto_mensal) {
		this.id_gasto_mensal = id_gasto_mensal;
	}
	public double getVl_gasto() {
		return vl_gasto;
	}
	public void setVl_gasto(double vl_gasto) {
		this.vl_gasto = vl_gasto;
	}
	public Date getAno_mes_vigencia() {
		return ano_mes_vigencia;
	}
	public void setAno_mes_vigencia(Date ano_mes_vigencia) {
		this.ano_mes_vigencia = ano_mes_vigencia;
	}
	public Date getDt_insercao() {
		return dt_insercao;
	}
	public void setDt_insercao(Date dt_insercao) {
		this.dt_insercao = dt_insercao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
