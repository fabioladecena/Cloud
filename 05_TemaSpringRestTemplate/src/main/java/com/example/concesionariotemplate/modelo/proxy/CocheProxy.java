package com.example.concesionariotemplate.modelo.proxy;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.concesionariotemplate.modelo.entidad.Coche;

public class CocheProxy {
	public static final String URL_COCHE = "http://localhost:8080/coche/";

	public List<Coche> listarCoche() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche[]> resp = restTemplate.getForEntity(URL_COCHE, Coche[].class);

		Coche[] arrayCoche = resp.getBody();
		List<Coche> lista = Arrays.asList(arrayCoche);
		
		return lista;
	}

	public Coche obtenerCoche(int id) {
		RestTemplate restTemplate = new RestTemplate();
		String cocheResourceUrl = URL_COCHE + id;
		ResponseEntity<Coche> resp = restTemplate.getForEntity(cocheResourceUrl, Coche.class);
		
		return resp.getBody();
	}

	public Coche alta(Coche coche) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		Coche cocheCreado = restTemplate.postForObject(URL_COCHE, requestBody, Coche.class);
		
		return cocheCreado;
	}
	
	public Coche modificar(Coche coche) {
		RestTemplate resTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		ResponseEntity<Coche> resp = resTemplate.exchange(URL_COCHE + coche.getId(), HttpMethod.PUT, requestBody, Coche.class);
		
		return resp.getBody();
	}
	
	public void borrar(int id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL_COCHE + id);
	}
}
