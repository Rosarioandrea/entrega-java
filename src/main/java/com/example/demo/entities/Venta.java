package main.java.com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;


import main.java.com.example.demo.entities.Cliente;
import main.java.com.example.demo.entities.Producto;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private Date fecha;
    private int cantidad;

    // Getters, Setters y otros métodos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Venta [cliente=" + cliente.getNombre() + ", producto=" + producto.getTitulo() +
                ", cantidad=" + cantidad + ", total=" + calcularTotal() + "]";
    }
}