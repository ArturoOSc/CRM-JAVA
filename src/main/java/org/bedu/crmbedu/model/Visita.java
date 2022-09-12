package org.bedu.crmbedu.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Visita {

    @PositiveOrZero
    private long id;

    @NotNull
    private ClienteClass cliente;

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

    public Visita() {
    }

    public Visita(@PositiveOrZero long id, @NotNull ClienteClass cliente, @PastOrPresent LocalDateTime fechaProgramada,
            @NotEmpty @Size(min = 10) String direccion, @NotEmpty @Size(min = 15) String proposito,
            @NotEmpty @Size(min = 4, max = 30) String vendedor) {
        this.id = id;
        this.cliente = cliente;
        this.fechaProgramada = fechaProgramada;
        Direccion = direccion;
        this.proposito = proposito;
        this.vendedor = vendedor;
    }

    
    
}
