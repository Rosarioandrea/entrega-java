package main.java.com.example.demo.repositories;

import com.example.ventas.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
