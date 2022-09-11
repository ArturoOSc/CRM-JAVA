package org.bedu.crmbedu.runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.bedu.crmbedu.persistence.ProductoRepository;
import org.bedu.crmbedu.persistence.entities.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductoRunners implements CommandLineRunner{

    private final ProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {
        Producto producto1 = creaProducto("Leche", "Lacteos", 26, "587567937", LocalDate.now());
        Producto producto2 = creaProducto("Cafe", "Productos del hogar", 13, "478329858475", LocalDate.now());
        Producto producto3 = creaProducto("Mesa", "Productos de jardin", 44, "58295692759", LocalDate.now());
        Producto producto4 = creaProducto("Azucar", "Azucar", 33, "2756783495", LocalDate.now());
        Producto producto5 = creaProducto("Libro de Java", "Libros", 58, "925692558957", LocalDate.now());
        Producto producto6 = creaProducto("Balon", "Jugetes", 100, "765934193655", LocalDate.now());
        Producto producto7 = creaProducto("Xbox", "Videojuegos", 6987,"98572985289", LocalDate.now());
        Producto producto8 = creaProducto("Audifonos", "Electronicos", 1499, "145771483", LocalDate.now());
        Producto producto9 = creaProducto("Lentes", "Optica", 3436, "9562734875", LocalDate.now());
        Producto producto10 = creaProducto("Mouse", "Electronicos", 346, "8395682098562", LocalDate.now());
        Producto producto11 = creaProducto("Teclado", "Electronicos", 1999, "4398745209", LocalDate.now());
        Producto producto12 = creaProducto("Monitor","Electronicos",865,"98292955872",LocalDate.now());
        List<Producto> productos = Arrays.asList(producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10, producto11, producto12);

        productoRepository.saveAll(productos);

    }

    private Producto creaProducto(String nombre, String categoria, float precio, String numeroRegistro, LocalDate fechaCreacion){
        Producto producto =  new Producto();
        producto.setNombre(nombre);
        producto.setCategoria(categoria);
        producto.setPrecio(precio);
        producto.setNumeroRegistro(numeroRegistro);
        producto.setFechaCreacion(fechaCreacion);

        return producto;
    }
    
}
