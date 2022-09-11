package org.bedu.crmbedu.runners;

import java.util.Arrays;
import java.util.List;


import org.bedu.crmbedu.persistence.EtapaRepository;
import org.bedu.crmbedu.persistence.entities.Etapa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EtapaRunners implements CommandLineRunner{

    private final EtapaRepository etapaRepository;

    @Override
    public void run(String... args) throws Exception {
        Etapa etapa1 = creaEtapa("En proceso", 0);
        Etapa etapa2 = creaEtapa("Enviado", 1); 
        Etapa etapa3 = creaEtapa("Recibido", 2); 
        Etapa etapa4 = creaEtapa("En proceso", 3); 
        Etapa etapa5 = creaEtapa("Enviado", 4); 
        Etapa etapa6 = creaEtapa("Recibido", 5); 
        Etapa etapa7 = creaEtapa("En proceso", 6); 
        Etapa etapa8 = creaEtapa("Enviado", 7); 
        Etapa etapa9 = creaEtapa("Recibido", 8); 
        Etapa etapa10 = creaEtapa("En proceso", 9); 
        Etapa etapa11 = creaEtapa("Enviado", 10); 
        Etapa etapa12 = creaEtapa("Recibido",11);   
        List<Etapa> etapas = Arrays.asList(etapa1, etapa2, etapa3, etapa4, etapa5, etapa6, etapa7, etapa8, etapa9, etapa10, etapa11, etapa12); 
        
        etapaRepository.saveAll(etapas);

    }

    private Etapa creaEtapa(String nombre, Integer orden){
        Etapa etapa = new Etapa();
        etapa.setNombre(nombre);
        etapa.setOrden(orden);

        return etapa;
    }
    
}
