package com.javabydeveloper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.javabydeveloper.model.Moneda;
import com.javabydeveloper.repository.MonedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javabydeveloper.model.TipoCambio;
import com.javabydeveloper.repository.TipoCambioRepository;

@SpringBootApplication
public class MySpringBootApplication {

	@Autowired
	private TipoCambioRepository tipoCambioRepository;
	@Autowired
	private MonedaRepository monedaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@PostConstruct
	private void initDb() {
		List<TipoCambio> tipoCambios = new ArrayList<>();
		TipoCambio tipoCambio = new TipoCambio();
		tipoCambio.setMonedaOrigen(1);
		tipoCambio.setMonedaDestino(2);
		tipoCambio.setTipoCambio(BigDecimal.valueOf(0.26));
		tipoCambio.setCreationTime(new Date());
		tipoCambios.add(tipoCambio);

		TipoCambio tipoCambio2 = new TipoCambio();
		tipoCambio2.setMonedaOrigen(1);
		tipoCambio2.setMonedaDestino(3);
		tipoCambio2.setTipoCambio(BigDecimal.valueOf(0.25));
		tipoCambio2.setCreationTime(new Date());
		tipoCambios.add(tipoCambio2);

		TipoCambio tipoCambio3 = new TipoCambio();
		tipoCambio3.setMonedaOrigen(1);
		tipoCambio3.setMonedaDestino(4);
		tipoCambio3.setTipoCambio(BigDecimal.valueOf(5));
		tipoCambio3.setCreationTime(new Date());
		tipoCambios.add(tipoCambio3);

		TipoCambio tipoCambio4 = new TipoCambio();
		tipoCambio4.setMonedaOrigen(2);
		tipoCambio4.setMonedaDestino(1);
		tipoCambio4.setTipoCambio(BigDecimal.valueOf(3.8447));
		tipoCambio4.setCreationTime(new Date());
		tipoCambios.add(tipoCambio4);

		TipoCambio tipoCambio5 = new TipoCambio();
		tipoCambio5.setMonedaOrigen(2);
		tipoCambio5.setMonedaDestino(3);
		tipoCambio5.setTipoCambio(BigDecimal.valueOf(0.97));
		tipoCambio5.setCreationTime(new Date());
		tipoCambios.add(tipoCambio5);

		TipoCambio tipoCambio6 = new TipoCambio();
		tipoCambio6.setMonedaOrigen(2);
		tipoCambio6.setMonedaDestino(4);
		tipoCambio6.setTipoCambio(BigDecimal.valueOf(19.22));
		tipoCambio6.setCreationTime(new Date());
		tipoCambios.add(tipoCambio6);

		TipoCambio tipoCambio7 = new TipoCambio();
		tipoCambio7.setMonedaOrigen(3);
		tipoCambio7.setMonedaDestino(1);
		tipoCambio7.setTipoCambio(BigDecimal.valueOf(4.284));
		tipoCambio7.setCreationTime(new Date());
		tipoCambios.add(tipoCambio7);

		TipoCambio tipoCambio8 = new TipoCambio();
		tipoCambio8.setMonedaOrigen(3);
		tipoCambio8.setMonedaDestino(2);
		tipoCambio8.setTipoCambio(BigDecimal.valueOf(1.03));
		tipoCambio8.setCreationTime(new Date());
		tipoCambios.add(tipoCambio8);

		TipoCambio tipoCambio9 = new TipoCambio();
		tipoCambio9.setMonedaOrigen(3);
		tipoCambio9.setMonedaDestino(4);
		tipoCambio9.setTipoCambio(BigDecimal.valueOf(19.86));
		tipoCambio9.setCreationTime(new Date());
		tipoCambios.add(tipoCambio9);

		TipoCambio tipoCambio10 = new TipoCambio();
		tipoCambio10.setMonedaOrigen(4);
		tipoCambio10.setMonedaDestino(1);
		tipoCambio10.setTipoCambio(BigDecimal.valueOf(3.2));
		tipoCambio10.setCreationTime(new Date());
		tipoCambios.add(tipoCambio10);

		TipoCambio tipoCambio11 = new TipoCambio();
		tipoCambio11.setMonedaOrigen(4);
		tipoCambio11.setMonedaDestino(2);
		tipoCambio11.setTipoCambio(BigDecimal.valueOf(0.052));
		tipoCambio11.setCreationTime(new Date());
		tipoCambios.add(tipoCambio11);

		TipoCambio tipoCambio12 = new TipoCambio();
		tipoCambio12.setMonedaOrigen(4);
		tipoCambio12.setMonedaDestino(3);
		tipoCambio12.setTipoCambio(BigDecimal.valueOf(0.05));
		tipoCambio12.setCreationTime(new Date());
		tipoCambios.add(tipoCambio12);

		tipoCambioRepository.saveAll(tipoCambios);

		List<Moneda> monedas = new ArrayList<>();
		Moneda moneda = new Moneda();
		moneda.setNomMoneda("SOLES");
		moneda.setCreationTime(new Date());
		monedas.add(moneda);

		Moneda moneda2 = new Moneda();
		moneda2.setNomMoneda("DOLARES");
		moneda2.setCreationTime(new Date());
		monedas.add(moneda2);

		Moneda moneda3 = new Moneda();
		moneda3.setNomMoneda("EUROS");
		moneda3.setCreationTime(new Date());
		monedas.add(moneda3);

		Moneda moneda4 = new Moneda();
		moneda4.setNomMoneda("PESOS MEXICANOS");
		moneda4.setCreationTime(new Date());
		monedas.add(moneda4);

		monedaRepository.saveAll(monedas);
	}
}
