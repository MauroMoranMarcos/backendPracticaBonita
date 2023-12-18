package model.services;

import model.entities.Producto;
import model.entities.Incidencia;
import model.entities.DetallesCompra;

import javax.management.InstanceNotFoundException;
import java.time.LocalDateTime;

public interface IncidenciaService {

    DetallesCompra findDetallesCompraByNumeroSerieProducto(String numeroSerieProducto) throws InstanceNotFoundException;

    LocalDateTime createIncidencia(String descripcion, String numeroSerieProducto, Boolean garantia, Double coste,
                                   Boolean aceptado);

    void agregarInforme(String informe, Long idIncidencia) throws InstanceNotFoundException;
}
