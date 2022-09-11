package org.bedu.crmbedu.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
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
    

}
