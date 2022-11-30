package com.javabydeveloper.bean;

public class ResponseBean {
    private int codigo;

    private String mensaje;

    private TipoCambioBean tipoCambio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public TipoCambioBean getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(TipoCambioBean tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
