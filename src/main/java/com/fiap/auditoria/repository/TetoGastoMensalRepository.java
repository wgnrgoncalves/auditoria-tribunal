package com.fiap.auditoria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.auditoria.model.TetoGastoMensal;
public interface TetoGastoMensalRepository extends JpaRepository<TetoGastoMensal, Long> {
	
}