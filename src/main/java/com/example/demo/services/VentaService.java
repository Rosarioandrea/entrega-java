package main.java.com.example.demo.services;

import com.example.ventas.entities.Venta;
import com.example.ventas.repositories.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> obtenerTodas() {
        return ventaRepository.findAll();
    }

    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }


}
