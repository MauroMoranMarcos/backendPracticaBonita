package rest.dtos;

public class IncidenciaDto {

    private Long id;

    private String descripcion;

    private String numeroSerieProducto;

    // 0 for "false" and 1 for "true"
    private Boolean garantia;

    private Double coste;

    // 0 for "false" and 1 for "true"
    private Boolean aceptado;

    private String fechaCita;

    private String informe;

    public IncidenciaDto(Long id, String descripcion, String numeroSerieProducto, Boolean garantia, Double coste, Boolean aceptado, String fechaCita, String informe) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroSerieProducto = numeroSerieProducto;
        this.garantia = garantia;
        this.coste = coste;
        this.aceptado = aceptado;
        this.fechaCita = fechaCita;
        this.informe = informe;
    }

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

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
}
