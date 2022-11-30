package com.javabydeveloper.service;

import com.javabydeveloper.bean.TipoCambioBean;
import com.javabydeveloper.exception.TipoCambioNotFoundException;

import java.math.BigDecimal;

public interface TipoCambioService {
    TipoCambioBean buscarTipoCambioPor(BigDecimal monto, int monedaOrigen, int monedaDestino) throws TipoCambioNotFoundException;
}
