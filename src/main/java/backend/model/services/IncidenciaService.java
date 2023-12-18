package backend.model.services;

import backend.model.entities.DetallesCompra;

import javax.management.InstanceNotFoundException;
import java.time.LocalDateTime;

public interface IncidenciaService {

    DetallesCompra findDetallesCompraByNumeroSerieProducto(String numeroSerieProducto) throws InstanceNotFoundException;

    LocalDateTime createIncidencia(String descripcion, String numeroSerieProducto, Boolean garantia, Double coste,
                                   Boolean aceptado);

    void agregarInforme(String informe, Long idIncidencia) throws InstanceNotFoundException;
}
