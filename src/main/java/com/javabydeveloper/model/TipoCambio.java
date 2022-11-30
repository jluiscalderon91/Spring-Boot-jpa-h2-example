package com.javabydeveloper.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "TIPO_CAMBIO")
public class TipoCambio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "ID")
	private int id;

	@Column(name = "MONEDA_ORIGEN")
	private int MonedaOrigen;

	//@org.springframework.data.annotation.Transient
	//@JsonIgnore
	@Column(name = "MONEDA_DESTINO")
	private int MonedaDestino;

	@Column(name = "TIPO_CAMBIO", columnDefinition = "DECIMAL(19,3)")
	private BigDecimal tipoCambio;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TIME")
	private Date creationTime;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonedaOrigen() {
		return MonedaOrigen;
	}

	public void setMonedaOrigen(int monedaOrigen) {
		MonedaOrigen = monedaOrigen;
	}

	public int getMonedaDestino() {
		return MonedaDestino;
	}

	public void setMonedaDestino(int monedaDestino) {
		MonedaDestino = monedaDestino;
	}

	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/*
	 * @Override public String toString() { return "User [id=" + id + ", userName="
	 * + userName + ", password=" + password + ", creationTime=" + creationTime +
	 * ", updatedTime=" + updatedTime + ", dateofBirth=" + dateofBirth +
	 * ", userType=" + userType + ", dateOfBirthString=" + dateOfBirthString + "]";
	 * }
	 */
}
