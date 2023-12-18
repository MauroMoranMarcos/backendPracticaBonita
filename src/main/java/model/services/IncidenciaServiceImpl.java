package model.services;

import model.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Transactional
public class IncidenciaServiceImpl implements IncidenciaService{

    @Autowired
    private DetallesCompraDao detallesCompraDao;

    @Autowired
    private IncidenciaDao incidenciaDao;

    @Autowired
    private ProductoDao productoDao;

    @Override
    public DetallesCompra findDetallesCompraByNumeroSerieProducto(String numeroSerieProducto) throws InstanceNotFoundException {
        Optional<DetallesCompra> detallesCompra = detallesCompraDao.findDetallesCompraByNumeroSerieProducto(numeroSerieProducto);

        if(detallesCompra.isEmpty()) {
            throw new InstanceNotFoundException("No se encuentran los detalles de compra para: " + numeroSerieProducto);
        }

        return detallesCompra.get();
    }

    @Override
    public LocalDateTime createIncidencia(String descripcion, String numeroSerieProducto, Boolean garantia, Double coste,
                                          Boolean aceptado) {
        LocalDateTime fechaCita = null;

        if(aceptado || garantia) {
            fechaCita = LocalDateTime.now().plusDays(3);
        }

        Incidencia incidencia = new Incidencia(descripcion, numeroSerieProducto, garantia, coste, aceptado, fechaCita);

        incidenciaDao.save(incidencia);
        return fechaCita;
    }

    @Override
    public void agregarInforme(String informe, Long idIncidencia) throws InstanceNotFoundException {

        Optional<Incidencia> incidenciaOptional = incidenciaDao.findById(idIncidencia);

        if(incidenciaOptional.isEmpty()) {
            throw new InstanceNotFoundException("No se encuentra una incidencia con id: " + idIncidencia);
        }

        Incidencia incidencia = incidenciaOptional.get();
        incidencia.setInforme(informe);

        incidenciaDao.save(incidencia);
    }
}
