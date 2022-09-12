package org.bedu.crmbedu.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Producto {

    @PositiveOrZero(message = "No negative numbers")
    private long id;
    
    @NotBlank(message = "Need information")
    @Size(min=4, max=30)
    private String nombre;

    private String categoria;
    
    @DecimalMin(value="1.00", inclusive = true, message = "Min price is 1.00")
    private float precio;
    
    @NotEmpty
    @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$")
    private String numeroRegistro;
    
    @PastOrPresent(message = "The date can't be a future date")
    private LocalDate fechaCreacion;

    public Producto() {
    }

    public Producto(@PositiveOrZero(message = "No negative numbers") long id,
            @NotBlank(message = "Need information") @Size(min = 4, max = 30) String nombre, String categoria,
            @DecimalMin(value = "1.00", inclusive = true, message = "Min price is 1.00") float precio,
            @NotEmpty @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$") String numeroRegistro,
            @PastOrPresent(message = "The date can't be a future date") LocalDate fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.numeroRegistro = numeroRegistro;
        this.fechaCreacion = fechaCreacion;
    }
    
    

}
