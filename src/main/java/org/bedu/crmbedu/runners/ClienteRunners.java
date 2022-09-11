package org.bedu.crmbedu.runners;

import java.util.Arrays;
import java.util.List;


import org.bedu.crmbedu.persistence.ClienteRepository;
import org.bedu.crmbedu.persistence.entities.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ClienteRunners implements CommandLineRunner {

    private final ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente1 = creaCliente("Inicializando", "null", "0", "null");
        Cliente cliente2 = creaCliente("Juan", "juan@gmail.com", "1", "Gto");
        Cliente cliente3 = creaCliente("Luis", "luis@gmail.com", "2", "Silao");
        Cliente cliente4 = creaCliente("Eric", "eric@gmail.com", "3", "Santa rosa");
        Cliente cliente5 = creaCliente("Noe", "noe@gmail.com", "4", "Aguascalientes");
        Cliente cliente6 = creaCliente("Hector", "hector@gmail.com", "5", "Dolores");
        Cliente cliente7 = creaCliente("Armando", "armando@gmail.com", "6", "Sinaloa");
        Cliente cliente8 = creaCliente("Hugo", "hugo@gmail.com", "7", "CDMX");
        Cliente cliente9 = creaCliente("Leo", "leo@gmail.com", "8", "Yucatan");
        Cliente cliente10 = creaCliente("Tomas", "tomas@gmail.com", "9", "Sonora");
        Cliente cliente11 = creaCliente("Ricardo", "ricardo@gmail.com", "10", "EUA");
        Cliente cliente12 = creaCliente("Jose", "jose@gmail.com", "11", "Veracruz");
        List<Cliente> clientes = Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6, cliente7, cliente8, cliente9, cliente10, cliente11, cliente12);

        clienteRepository.saveAll(clientes);
    }

    private Cliente creaCliente(String nombre, String correoContacto, String numeroEmpleados, String direccion){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCorreoContacto(correoContacto);
        cliente.setNumeroEmpleados(numeroEmpleados);
        cliente.setDireccion(direccion);

        return cliente;
    }
}
