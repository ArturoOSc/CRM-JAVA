package org.bedu.crmbedu.model;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Etapa {

    @PositiveOrZero
    private long etapaId;
    @NotEmpty
    @Size(min=4,max=30)
    private String nombre;
    @Positive
    private int orden;
    
    
    
}
