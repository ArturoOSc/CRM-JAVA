package org.bedu.crmbedu.persistence;


import org.bedu.crmbedu.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}