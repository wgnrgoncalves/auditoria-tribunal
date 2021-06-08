package com.fiap.auditoria.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.auditoria.model.Prefeitura;
import com.fiap.auditoria.model.TetoGastoMensal;
public interface PrefeituraRepository extends JpaRepository<Prefeitura, Long> {
	
	
}