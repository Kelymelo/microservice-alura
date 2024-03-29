package com.gft.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long>{
	
	InfoFornecedor findByEstado(String estado);

}
