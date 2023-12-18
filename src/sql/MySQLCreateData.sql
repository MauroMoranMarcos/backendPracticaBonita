-- ----------------------------------------------------------------------------
-- Model
-------------------------------------------------------------------------------

DROP TABLE DetallesCompra;
DROP TABLE Producto;
DROP TABLE Incidencia;

-- ----------------------------- DetallesCompra --------------------------------

CREATE TABLE DetallesCompra ( id INT NOT NULL AUTO_INCREMENT,
                     numeroSerieProducto VARCHAR(256) NOT NULL,
                     email VARCHAR(128) NOT NULL,
                     precio FLOAT NOT NULL,
                     fechaCompra DATETIME NOT NULL,
                     idProducto INT NOT NULL,
                     CONSTRAINT ProductoPK PRIMARY KEY(id),
                     CONSTRAINT CompraProductoIdFK FOREIGN KEY(idProducto)
                         REFERENCES Proucto(id) ON DELETE CASCADE ) ENGINE = InnoDB;

-- --------------------------------- Producto -----------------------------------

CREATE TABLE Producto ( id INT NOT NULL AUTO_INCREMENT,
                      nombre VARCHAR(128 NOT NULL,
                      CONSTRAINT ProductoPK PRIMARY KEY(id);

-- -------------------------------- Incidencia ----------------------------------

CREATE TABLE Incidencia ( id INT NOT NULL AUTO_INCREMENT,
                      descripcion VARCHAR(1024) NOT NULL,
                      numeroSerieProducto VARCHAR(256) NOT NULL,
                      garantia BOOLEAN,
                      coste FLOAT,
                      aceptado BOOLEAN,
                      fechaCita DATETIME,
                      CONSTRAINT IncidenciaPK PRIMARY KEY(id);