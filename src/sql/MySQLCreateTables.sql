-- ----------------------------------------------------------------------------
-- Model
-------------------------------------------------------------------------------

DROP TABLE IF EXISTS compra;
DROP TABLE IF EXISTS incidencia;

-- ----------------------------- DetallesCompra --------------------------------

CREATE TABLE compra ( id INT NOT NULL AUTO_INCREMENT,
                              numero_serie_producto VARCHAR(256) NOT NULL,
                              email VARCHAR(128) NOT NULL,
                              precio FLOAT NOT NULL,
                              fecha_compra DATETIME NOT NULL,
                              nombre VARCHAR(128) NOT NULL,
                              CONSTRAINT ProductoPK PRIMARY KEY(id)
                            ) ENGINE = InnoDB;

-- -------------------------------- Incidencia ----------------------------------

CREATE TABLE incidencia ( id INT NOT NULL AUTO_INCREMENT,
                          descripcion VARCHAR(1024) NOT NULL,
                          numero_serie_producto VARCHAR(256) NOT NULL,
                          garantia BOOLEAN,
                          coste FLOAT,
                          aceptado BOOLEAN,
                          fecha_cita DATETIME,
                          informe VARCHAR(1024),
                          CONSTRAINT IncidenciaPK PRIMARY KEY(id)
                        ) ENGINE = InnoDB;



INSERT INTO compra (numero_serie_producto, email, precio, fecha_compra, nombre) VALUES ('carretilla1', 'comprador@udc.es', 10, DATE_ADD(DATE(NOW()), INTERVAL '0 00:05' DAY_MINUTE), 'carretilla');

INSERT INTO compra (numero_serie_producto, email, precio, fecha_compra, nombre) VALUES ('123cuadro', 'elquecompra@udc.es', 20, DATE_ADD(DATE(NOW()), INTERVAL '0 17:35' DAY_MINUTE), 'cuadro');

INSERT INTO compra (numero_serie_producto, email, precio, fecha_compra, nombre) VALUES ('tabla99planchar', 'comprador@udc.es', 7, DATE_ADD(DATE(NOW()), INTERVAL '0 12:05' DAY_MINUTE), 'tabla planchar');

INSERT INTO compra (numero_serie_producto, email, precio, fecha_compra, nombre) VALUES ('tabla2planchar', 'yocompro@udc.es', 7, DATE_ADD(DATE(NOW()), INTERVAL '0 07:55' DAY_MINUTE), 'tabla planchar');

INSERT INTO incidencia (descripcion, numero_serie_producto, garantia, coste, aceptado, fecha_cita) VALUES ('descripcion incidencia', 'tabla2planchar', true, 0, true, DATE_ADD(DATE(NOW()), INTERVAL '0 12:05' DAY_MINUTE));

