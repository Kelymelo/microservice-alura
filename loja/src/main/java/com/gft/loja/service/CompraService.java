package com.gft.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gft.loja.dto.InfoFornecedorDTO;
import com.gft.loja.dto.compraDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate client;
	
	@Autowired
	private DiscoveryClient eurekaClient;

	public void realizaCompra(compraDTO compraDto) {
		
				
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://fornecedor/info/" + compraDto.getEndereco().getEstado(),
				                   HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		eurekaClient.getInstances("fornecedor").stream().forEach(fornecedor -> {
			System.out.println("localhost");
		});
		
		System.out.println(exchange.getBody().getEndereco());
	}
}
