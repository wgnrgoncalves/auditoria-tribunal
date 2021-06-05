package com.fiap.auditoria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.auditoria.model.GastoMensal;
public interface GastoMensalRepository extends JpaRepository<GastoMensal, Long> {
	
}
