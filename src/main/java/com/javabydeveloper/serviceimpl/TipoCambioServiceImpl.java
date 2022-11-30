package com.javabydeveloper.serviceimpl;

import com.javabydeveloper.bean.ResponseBean;
import com.javabydeveloper.bean.TipoCambioBean;
import com.javabydeveloper.exception.TipoCambioNotFoundException;
import com.javabydeveloper.model.TipoCambio;
import com.javabydeveloper.repository.MonedaRepository;
import com.javabydeveloper.repository.TipoCambioRepository;
import com.javabydeveloper.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {
    public static final int ERROR_CODE = 404;
    public static final int OK = 200;

    @Autowired
    private TipoCambioRepository tipoCambioRepository;
    @Autowired
    private MonedaRepository monedaRepository;

    public ResponseBean buscarTipoCambioPor(BigDecimal monto, int monedaOrigen, int monedaDestino)  {

        ResponseBean responseBean = new ResponseBean();
        TipoCambioBean tipoCambioBean = new TipoCambioBean();
        try {
            TipoCambio tipoCambio = tipoCambioRepository.findAll().stream().collect(Collectors.toList()).stream()
                    .filter(t -> t.getMonedaOrigen() == monedaOrigen && t.getMonedaDestino() == monedaDestino)
                    .findFirst().orElseThrow(() -> new TipoCambioNotFoundException("No existe el tipo de cambio"));

            tipoCambioBean.setMonto(monto);
            BigDecimal calcularCambio = tipoCambio.getTipoCambio().multiply(monto);
            tipoCambioBean.setMontoConTipoCambio(calcularCambio);
            tipoCambioBean.setMonedaOrigen(monedaRepository.getById(tipoCambio.getMonedaOrigen()).getNomMoneda());
            tipoCambioBean.setMonedaDestino(monedaRepository.getById(tipoCambio.getMonedaDestino()).getNomMoneda());
            tipoCambioBean.setTipoCambio(tipoCambio.getTipoCambio());
            responseBean.setCodigo(OK);
            responseBean.setMensaje("Tipo de cambio realizado con éxito");
            responseBean.setTipoCambio(tipoCambioBean);
        }catch (Exception e){
            responseBean.setCodigo(ERROR_CODE);
            responseBean.setMensaje(e.getMessage());
        }
        return responseBean;
    }
}
