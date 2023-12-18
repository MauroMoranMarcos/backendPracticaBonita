package backend.model.entities;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "DetallesCompra")
public class DetallesCompra {

    private Long id;
    private String numeroSerieProducto;
    private String email;
    private Double precio;
    private LocalDateTime fechaCompra;
    private String nombre;

    public DetallesCompra() {}

    public DetallesCompra(String numeroSerieProducto, String email, Double precio, LocalDateTime fechaCompra,
                          String nombre) {
        this.numeroSerieProducto = numeroSerieProducto;
        this.email = email;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroSerieProducto() {
        return numeroSerieProducto;
    }

    public void setNumeroSerieProducto(String numeroSerieProducto) {
        this.numeroSerieProducto = numeroSerieProducto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
