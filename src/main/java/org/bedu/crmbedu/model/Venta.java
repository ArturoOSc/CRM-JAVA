package org.bedu.crmbedu.model;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Venta {
    
    @PositiveOrZero
    private long ventaId;

    @DecimalMin(value = "1.00", inclusive = true)
    private float monto;

    @NotEmpty
    private List<Producto> productos;
    
    @NotNull
    private Cliente cliente;
    
    @PastOrPresent
    private LocalDateTime fechaCreacion;
    
    
}
