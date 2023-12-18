package backend.rest.dtos;

import backend.model.entities.DetallesCompra;

public class DetallesCompraConversor {

    private DetallesCompraConversor() {
    }

    public final static DetallesCompraDto toDetallesCompraDto(DetallesCompra detallesCompra) {

        return new DetallesCompraDto(detallesCompra.getId(), detallesCompra.getNumeroSerieProducto(), detallesCompra.getEmail(),
                detallesCompra.getPrecio(), detallesCompra.getFechaCompra().toString(), detallesCompra.getNombre());

    }

}
