package backend.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    private Long id;
    private String nombre;

    public Producto() {}

    public Producto(String nombre) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
