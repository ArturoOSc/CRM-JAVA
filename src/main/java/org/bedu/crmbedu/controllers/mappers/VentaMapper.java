package org.bedu.crmbedu.controllers.mappers;


import org.bedu.crmbedu.persistence.entities.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(org.bedu.crmbedu.model.Venta ventaModel);

    org.bedu.crmbedu.model.Venta ventaEntityToVentaModel(Venta venta);
}
