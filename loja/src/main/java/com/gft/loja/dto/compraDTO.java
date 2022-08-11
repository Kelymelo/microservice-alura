package com.gft.loja.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class compraDTO {

	private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;
	
}
