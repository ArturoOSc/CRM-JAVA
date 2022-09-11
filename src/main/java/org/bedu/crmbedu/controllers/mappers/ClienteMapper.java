package org.bedu.crmbedu.controllers.mappers;


import org.bedu.crmbedu.persistence.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(org.bedu.crmbedu.model.Cliente clienteModel);

    org.bedu.crmbedu.model.Cliente clienteEntityToClienteModel(Cliente cliente);
}