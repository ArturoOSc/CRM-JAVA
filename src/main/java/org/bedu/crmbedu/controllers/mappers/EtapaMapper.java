package org.bedu.crmbedu.controllers.mappers;

import org.bedu.crmbedu.persistence.entities.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(org.bedu.crmbedu.model.Etapa etapaModel);

    org.bedu.crmbedu.model.Etapa etapaEntityToEtapaModel(Etapa etapa);
}
