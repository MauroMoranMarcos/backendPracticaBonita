package model.entities;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface DetallesCompraDao extends PagingAndSortingRepository<DetallesCompra, Long> {
    Optional<DetallesCompra> findDetallesCompraByNumeroSerieProducto(String numeroSerieProducto);
}
