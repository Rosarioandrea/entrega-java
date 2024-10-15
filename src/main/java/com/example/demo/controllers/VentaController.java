package com.example.demo.controllers;

import com.example.demo.services.VentaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }


    @PostMapping
    public Venta crearVenta(@RequestBody Venta venta) {
        // Lógica para crear una venta
        return ventaService.crearVenta(venta);
    }


}
