package main.java.com.example.demo.controllers;

import com.example.demo.entities.Producto;
import com.example.demo.services.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.obtenerTodos();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }


}