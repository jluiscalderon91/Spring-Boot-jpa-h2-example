package com.javabydeveloper.serviceimpl;

import com.javabydeveloper.bean.TipoCambioBean;
import com.javabydeveloper.exception.TipoCambioNotFoundException;
import com.javabydeveloper.model.TipoCambio;
import com.javabydeveloper.repository.MonedaRepository;
import com.javabydeveloper.repository.TipoCambioRepository;
import com.javabydeveloper.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {
    @Autowired
    private TipoCambioRepository tipoCambioRepository;
    @Autowired
    private MonedaRepository monedaRepository;

    public TipoCambioBean buscarTipoCambioPor(BigDecimal monto, int monedaOrigen, int monedaDestino) throws TipoCambioNotFoundException {

        TipoCambioBean tipoCambioBean = new TipoCambioBean();
        Optional optional = tipoCambioRepository.findAll().stream().collect(Collectors.toList()).stream()
                .filter(t -> t.getMonedaOrigen() == monedaOrigen && t.getMonedaDestino() == monedaDestino)
                .findFirst();

        if (!optional.isPresent()) {
            throw new TipoCambioNotFoundException("No existe el tipo de cambio.");
        }

        TipoCambio tipoCambio = (TipoCambio)optional.get();
        tipoCambioBean.setMonto(monto);
        BigDecimal calcularCambio = tipoCambio.getTipoCambio().multiply(monto);
        tipoCambioBean.setMontoConTipoCambio(calcularCambio);
        tipoCambioBean.setMonedaOrigen(monedaRepository.getById(tipoCambio.getMonedaOrigen()).getNomMoneda());
        tipoCambioBean.setMonedaDestino(monedaRepository.getById(tipoCambio.getMonedaDestino()).getNomMoneda());
        tipoCambioBean.setTipoCambio(tipoCambio.getTipoCambio());

        return tipoCambioBean;
    }
}
