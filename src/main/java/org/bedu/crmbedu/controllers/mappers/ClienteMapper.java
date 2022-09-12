package org.bedu.crmbedu.controllers.mappers;


import org.bedu.crmbedu.persistence.entities.Cliente;
import org.mapstruct.Mapper;
import org.bedu.crmbedu.model.ClienteClass;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(ClienteClass clienteModel);

    ClienteClass clienteEntityToClienteModel(Cliente cliente);
}