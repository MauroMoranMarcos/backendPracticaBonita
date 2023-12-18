package rest.dtos;

public class DetallesCompraDto {

    private Long id;

    private String numeroSerieProducto;

    private String email;

    private Double precio;

    private String fechaCompra;

    private Long idProducto;

    public DetallesCompraDto(Long id, String numeroSerieProducto, String email, Double precio, String fechaCompra, Long idProducto) {
        this.id = id;
        this.numeroSerieProducto = numeroSerieProducto;
        this.email = email;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.idProducto = idProducto;
    }

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

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
}
