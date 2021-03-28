CREATE TABLE categoria(
    id_categoria SERIAL NOT NULL,
    descripcion VARCHAR(120) NOT NULL,
    estado BOOLEAN DEFAULT true,
    constraint categoria_pk PRIMARY KEY(id_categoria)
);

CREATE  TABLE producto(
  id_producto SERIAL NOT NULL ,
  nombre VARCHAR (45) NOT NULL,
  id_categoria INTEGER NOT NULL,
  codigo_barras VARCHAR (150),
  precio_ventas DECIMAL (16,2),
  cantidad_stock INT NOT NULL,
  estado BOOLEAN default true,
  constraint producto_pk PRIMARY KEY(id_producto),
  constraint producto_categoria_fk FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE  TABLE cliente(
  cedula VARCHAR(20) NOT NULL,
  nombre VARCHAR (40) NOT NULL,
  apellido VARCHAR(100) NOT NULL,
  celular INT NOT NULL ,
  direccion VARCHAR(80),
  correo_electronico VARCHAR (120) NOT NULL,
  constraint cliente_pk PRIMARY KEY(cedula),
  constraint cliente_uq UNIQUE (correo_electronico)
);

CREATE TABLE compra(
    id_compra SERIAL NOT NULL,
    cliente VARCHAR(20) NOT NULL,
    fecha TIMESTAMP NULL ,
    medio_pago CHAR (1) NULL ,
    comentario VARCHAR (250),
    estado CHAR(1) NULL ,
    constraint compra_pk PRIMARY KEY (id_compra),
    constraint compra_cliente_fk FOREIGN KEY (cliente) REFERENCES cliente(cedula)
);

CREATE TABLE compra_producto(
  id_compra INT NOT NULL ,
  id_producto INT NOT NULL ,
  cantidad INT  NOT NULL,
  total DECIMAL (16,2) NOT NULL ,
  estado BOOLEAN ,
  constraint compra_producto_pk PRIMARY KEY (id_compra,id_producto),
  constraint compra_fk FOREIGN KEY (id_compra) REFERENCES compra(id_compra),
  constraint producto_fk FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);