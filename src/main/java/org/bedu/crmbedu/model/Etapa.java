package org.bedu.crmbedu.model;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Etapa {

    @PositiveOrZero
    private long etapaId;
    @NotEmpty
    @Size(min=4,max=30)
    private String nombre;
    @Positive
    private int orden;

    public Etapa() {
    }

    public Etapa(@PositiveOrZero long etapaId, @NotEmpty @Size(min = 4, max = 30) String nombre, @Positive int orden) {
        this.etapaId = etapaId;
        this.nombre = nombre;
        this.orden = orden;
    }
    
    
    
    
}
