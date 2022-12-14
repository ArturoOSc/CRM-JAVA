package org.bedu.crmbedu.services;

import lombok.RequiredArgsConstructor;
import org.bedu.crmbedu.controllers.mappers.ClienteMapper;
import org.bedu.crmbedu.model.ClienteClass;
import org.bedu.crmbedu.persistence.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    public ClienteClass guardaCliente(ClienteClass cliente) {
        return mapper.clienteEntityToClienteModel(
                repository.save(mapper.clienteModelToClienteEntity(cliente))
        );
    }

    public List<ClienteClass> obtenClientes(){
        return repository.findAll().stream().map(cliente -> mapper.clienteEntityToClienteModel(cliente)).collect(Collectors.toList());
    }

    public Optional<ClienteClass> obtenCliente(long idCliente) {
        return repository.findById(idCliente)
                .map(cliente -> Optional.of(mapper.clienteEntityToClienteModel(cliente)))
                .orElse(Optional.empty());
    }

    public void eliminaCliente(long idcliente){
        repository.deleteById(idcliente);
    }

    public ClienteClass actualizaCliente(ClienteClass cliente){
        return mapper.clienteEntityToClienteModel(
                repository.save(mapper.clienteModelToClienteEntity(cliente))
        );
    }

    public long cuenteClientes(){
        return repository.count();
    }
}