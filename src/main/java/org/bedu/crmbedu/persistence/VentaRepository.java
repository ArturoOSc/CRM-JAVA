package org.bedu.crmbedu.persistence;

import org.bedu.crmbedu.persistence.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}