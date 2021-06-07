package com.fiap.auditoria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.auditoria.model.Prefeitura;
public interface PrefeituraRepository extends JpaRepository<Prefeitura, Long> {
}