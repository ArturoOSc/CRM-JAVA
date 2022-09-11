package org.bedu.crmbedu.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Visita {

    @PositiveOrZero
    private long id;

    @NotNull
    private Cliente cliente;

    @PastOrPresent
    private LocalDateTime fechaProgramada;

    @NotEmpty
    @Size(min = 10)
    private String Direccion;

    @NotEmpty
    @Size(min = 15)
    private String proposito;

    @NotEmpty
    @Size(min = 4, max = 30)
    private String vendedor;

    
}
