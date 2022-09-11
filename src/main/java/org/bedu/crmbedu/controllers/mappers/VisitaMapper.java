package org.bedu.crmbedu.controllers.mappers;


import org.bedu.crmbedu.persistence.entities.Visita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    Visita visitaModelToVisitaEntity(org.bedu.crmbedu.model.Visita visitaModel);

    org.bedu.crmbedu.model.Visita visitaEntityToVisitaModel(Visita visita);
}
