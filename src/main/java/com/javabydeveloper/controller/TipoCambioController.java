package com.javabydeveloper.controller;

import java.math.BigDecimal;

import com.javabydeveloper.bean.ResponseBean;
import com.javabydeveloper.exception.TipoCambioNotFoundException;
import com.javabydeveloper.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/change")
public class TipoCambioController {

	@Autowired
	private TipoCambioService tipoCambioService;

	@GetMapping("/monto/{monto}/monedaOrigen/{monedaOrigen}/monedaDestino/{monedaDestino}")
	public ResponseEntity<ResponseBean> getTipoCambioBy(@PathVariable(value = "monto") BigDecimal monto,
														@PathVariable(value = "monedaOrigen") int monedaOrigen,
														@PathVariable(value = "monedaDestino") int monedaDestino) throws TipoCambioNotFoundException {
		ResponseBean responseBean = tipoCambioService.buscarTipoCambioPor(monto, monedaOrigen, monedaDestino);
		return ResponseEntity.ok().body(responseBean);
	}
}
