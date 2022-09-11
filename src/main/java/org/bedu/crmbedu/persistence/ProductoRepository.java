package org.bedu.crmbedu.persistence;


import org.bedu.crmbedu.persistence.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}