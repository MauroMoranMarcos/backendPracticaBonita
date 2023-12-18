package backend.model.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Incidencia")
public class Incidencia {

    private Long id;
    private String descripcion;
    private String numeroSerieProducto;
    private Boolean garantia;
    private Double coste;
    private Boolean aceptado;
    private LocalDateTime fechaCita;
    private String informe;

    public Incidencia() {}

    public Incidencia(String descripcion, String numeroSerieProducto, Boolean garantia, Double coste, Boolean aceptado,
                      LocalDateTime fechaCita) {
        this.descripcion = descripcion;
        this.numeroSerieProducto = numeroSerieProducto;
        this.garantia = garantia;
        this.coste = coste;
        this.aceptado = aceptado;
        this.fechaCita = fechaCita;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroSerieProducto() {
        return numeroSerieProducto;
    }

    public void setNumeroSerieProducto(String numeroSerieProducto) {
        this.numeroSerieProducto = numeroSerieProducto;
    }

    public Boolean getGarantia() {
        return garantia;
    }

    public void setGarantia(Boolean garantia) {
        this.garantia = garantia;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
}
