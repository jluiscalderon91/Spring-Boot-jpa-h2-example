package com.javabydeveloper.bean;

import java.math.BigDecimal;

public class TipoCambioBean {

    private BigDecimal monto;

    private BigDecimal montoConTipoCambio;

    private String monedaOrigen;

    private String monedaDestino;

    private BigDecimal tipoCambio;

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMontoConTipoCambio() {
        return montoConTipoCambio;
    }

    public void setMontoConTipoCambio(BigDecimal montoConTipoCambio) {
        this.montoConTipoCambio = montoConTipoCambio;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
