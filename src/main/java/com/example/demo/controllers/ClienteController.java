package main.java.com.example.demo.controllers;

import com.example.demo.entities.Cliente;
import com.example.demo.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.obtenerTodos();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }


}