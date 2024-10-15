package main.java.com.example.demo.repositories;

import com.example.ventas.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
