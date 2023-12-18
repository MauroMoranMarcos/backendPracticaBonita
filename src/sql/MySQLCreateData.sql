-- ----------------------------------------------------------------------------
-- Model
-------------------------------------------------------------------------------

DROP TABLE DetallesCompra;
DROP TABLE Incidencia;

-- ----------------------------- DetallesCompra --------------------------------

CREATE TABLE DetallesCompra ( idDetallesCompra INT NOT NULL AUTO_INCREMENT,
                     numeroSerieProducto VARCHAR(256) NOT NULL,
                     email VARCHAR(128) NOT NULL,
                     precio FLOAT NOT NULL,
                     fechaCompra DATETIME NOT NULL,
                     nombre VARCHAR(128) NOT NULL
                     CONSTRAINT ProductoPK PRIMARY KEY(idDetallesCompra);

-- -------------------------------- Incidencia ----------------------------------

CREATE TABLE Incidencia ( idIncidencia INT NOT NULL AUTO_INCREMENT,
                      descripcion VARCHAR(1024) NOT NULL,
                      numeroSerieProducto VARCHAR(256) NOT NULL,
                      garantia BOOLEAN,
                      coste FLOAT,
                      aceptado BOOLEAN,
                      fechaCita DATETIME,
                      CONSTRAINT IncidenciaPK PRIMARY KEY(idIncidencia);