package com.example.demo.repositories;

import com.example.demo.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Puedes agregar métodos personalizados aquí si lo necesitas
}