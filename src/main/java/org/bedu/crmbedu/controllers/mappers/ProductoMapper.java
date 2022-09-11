package org.bedu.crmbedu.controllers.mappers;


import org.bedu.crmbedu.persistence.entities.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.crmbedu.model.Producto productoModel);

    org.bedu.crmbedu.model.Producto productoEntityToProductoModel(Producto producto);
}