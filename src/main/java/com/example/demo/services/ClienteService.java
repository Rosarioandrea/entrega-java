package main.java.com.example.demo.services;
import com.example.ventas.entities.Cliente;
import com.example.ventas.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
