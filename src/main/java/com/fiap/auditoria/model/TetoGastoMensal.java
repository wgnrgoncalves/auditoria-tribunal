package com.fiap.auditoria.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TetoGastoMensal {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	private Long id_teto_gasto_mensal;
	private double vl_teto;
	private double vl_critico;
	private Date dt_inicial;
	private Date dt_final;
	
	public double getVl_teto() {
		return vl_teto;
	}
	public void setVl_teto(double vl_teto) {
		this.vl_teto = vl_teto;
	}
	public double getVl_critico() {
		return vl_critico;
	}
	public void setVl_critico(double vl_critico) {
		this.vl_critico = vl_critico;
	}
	public Date getDt_inicial() {
		return dt_inicial;
	}
	public void setDt_inicial(Date dt_inicial) {
		this.dt_inicial = dt_inicial;
	}
	public Date getDt_final() {
		return dt_final;
	}
	public void setDt_final(Date dt_final) {
		this.dt_final = dt_final;
	}
}
