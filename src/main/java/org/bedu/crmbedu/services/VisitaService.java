package org.bedu.crmbedu.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bedu.crmbedu.controllers.mappers.VisitaMapper;
import org.bedu.crmbedu.model.Visita;
import org.bedu.crmbedu.persistence.VisitaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VisitaService {
    private final VisitaRepository repository;
    private final VisitaMapper mapper;

    public Visita guardaVisita(Visita visita) {
        return mapper.visitaEntityToVisitaModel(
                repository.save(mapper.visitaModelToVisitaEntity(visita))
        );
    }

    public List<Visita> obtenVisitas(){
        return repository.findAll().stream().map(visita -> mapper.visitaEntityToVisitaModel(visita)).collect(Collectors.toList());
    }

    public Optional<Visita> obtenVisita(long idVisita) {
        return repository.findById(idVisita)
                .map(Visita -> Optional.of(mapper.visitaEntityToVisitaModel(Visita)))
                .orElse(Optional.empty());
    }

    public void eliminaVisita(long idVisita){
        repository.deleteById(idVisita);
    }

    public Visita actualizaVisita(Visita visita){
        return mapper.visitaEntityToVisitaModel(
                repository.save(mapper.visitaModelToVisitaEntity(visita))
        );
    }

    public long cuenteVisitas(){
        return repository.count();
    }
}
