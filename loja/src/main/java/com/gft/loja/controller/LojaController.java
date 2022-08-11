package com.gft.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.loja.dto.compraDTO;
import com.gft.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class LojaController {

	@Autowired
	private CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody compraDTO compraDto) {
		
		compraService.realizaCompra(compraDto);
	}
}
