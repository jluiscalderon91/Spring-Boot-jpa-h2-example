package com.javabydeveloper.service;

import com.javabydeveloper.bean.ResponseBean;
import java.math.BigDecimal;

public interface TipoCambioService {
    ResponseBean buscarTipoCambioPor(BigDecimal monto, int monedaOrigen, int monedaDestino);
}
