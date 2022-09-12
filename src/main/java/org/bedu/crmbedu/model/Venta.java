package org.bedu.crmbedu.model;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Venta {
    
    @PositiveOrZero
    private long ventaId;

    @DecimalMin(value = "1.00", inclusive = true)
    private float monto;

    @NotEmpty
    private List<Producto> productos;
    
    @NotNull
    private ClienteClass cliente;
    
    @PastOrPresent
    private LocalDateTime fechaCreacion;

    public Venta() {
    }

    public Venta(@PositiveOrZero long ventaId, @DecimalMin(value = "1.00", inclusive = true) float monto,
            @NotEmpty List<Producto> productos, @NotNull ClienteClass cliente,
            @PastOrPresent LocalDateTime fechaCreacion) {
        this.ventaId = ventaId;
        this.monto = monto;
        this.productos = productos;
        this.cliente = cliente;
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
