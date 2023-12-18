-- ----------------------------------------------------------------------------
-- Model
-------------------------------------------------------------------------------

DROP TABLE IF EXISTS DetallesCompra;
DROP TABLE IF EXISTS Incidencia;

-- ----------------------------- DetallesCompra --------------------------------

CREATE TABLE DetallesCompra ( idDetallesCompra INT NOT NULL AUTO_INCREMENT,
                              numeroSerieProducto VARCHAR(256) NOT NULL,
                              email VARCHAR(128) NOT NULL,
                              precio FLOAT NOT NULL,
                              fechaCompra DATETIME NOT NULL,
                              nombre VARCHAR(128) NOT NULL,
                              CONSTRAINT ProductoPK PRIMARY KEY(idDetallesCompra)
                            ) ENGINE = InnoDB;

-- -------------------------------- Incidencia ----------------------------------

CREATE TABLE Incidencia ( idIncidencia INT NOT NULL AUTO_INCREMENT,
                          descripcion VARCHAR(1024) NOT NULL,
                          numeroSerieProducto VARCHAR(256) NOT NULL,
                          garantia BOOLEAN,
                          coste FLOAT,
                          aceptado BOOLEAN,
                          fechaCita DATETIME,
                          CONSTRAINT IncidenciaPK PRIMARY KEY(idIncidencia)
                        ) ENGINE = InnoDB;



INSERT INTO DetallesCompra (numeroSerieProducto, email, precio, fechaCompra, nombre) VALUES ('carretilla1', 'comprador@udc.es', 10, DATE_ADD(DATE(NOW()), INTERVAL '0 00:05' DAY_MINUTE), 'carretilla');

INSERT INTO DetallesCompra (numeroSerieProducto, email, precio, fechaCompra, nombre) VALUES ('123cuadro', 'elquecompra@udc.es', 20, DATE_ADD(DATE(NOW()), INTERVAL '0 17:35' DAY_MINUTE), 'cuadro');

INSERT INTO DetallesCompra (numeroSerieProducto, email, precio, fechaCompra, nombre) VALUES ('tabla99planchar', 'comprador@udc.es', 7, DATE_ADD(DATE(NOW()), INTERVAL '0 12:05' DAY_MINUTE), 'tabla planchar');

INSERT INTO DetallesCompra (numeroSerieProducto, email, precio, fechaCompra, nombre) VALUES ('tabla2planchar', 'yocompro@udc.es', 7, DATE_ADD(DATE(NOW()), INTERVAL '0 07:55' DAY_MINUTE), 'tabla planchar');

