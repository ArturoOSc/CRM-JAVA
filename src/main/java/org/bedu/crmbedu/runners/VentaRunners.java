/*package org.bedu.crmbedu.runners;

import java.time.LocalDateTime;
import java.util.List;

import org.bedu.crmbedu.model.Cliente;
import org.bedu.crmbedu.model.Producto;
import org.bedu.crmbedu.model.Venta;
import org.bedu.crmbedu.persistence.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VentaRunners implements CommandLineRunner{

    private final VentaRepository ventaRepository;

    @Override
    public void run(String... args) throws Exception {
        
    }

    private Venta creaVenta(float monto, List<Producto> productos, Cliente cliente, LocalDateTime fechaCreacion){
        Venta venta = new Venta();
        venta.setMonto(monto);
        venta.setCliente(cliente);
        venta.setProductos(productos);
        venta.setFechaCreacion(fechaCreacion);

        return venta;
    }
    
    
    
}
*/