package model.entities;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoDao extends PagingAndSortingRepository<Producto, Long> {
}
