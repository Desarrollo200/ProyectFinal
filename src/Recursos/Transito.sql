create database poryectofinaldesarrollo;
use poryectofinaldesarrollo;

CREATE TABLE aseguradora (
    nit                  INTEGER NOT NULL,
    representate_legal   VARCHAR(30) NOT NULL,
    nombre               VARCHAR(30) NOT NULL,
    direccion            VARCHAR(100) NOT NULL,
    telefono             VARCHAR(10) NOT NULL,
    celular              VARCHAR(15) NOT NULL,
    correo               VARCHAR(30) NOT NULL,
    usuario              VARCHAR(30) NOT NULL,
    municipio            INTEGER NOT NULL,
    CONSTRAINT aseguradora_pk PRIMARY KEY ( nit )
);

CREATE TABLE categorias_licencia (
    id            INTEGER NOT NULL auto_increment,
    nombre        VARCHAR(2) NOT NULL,
    descripcion   VARCHAR(200) NOT NULL,
    CONSTRAINT categorias_licencia_pk PRIMARY KEY ( id )
);

CREATE TABLE cda (
    nit                   INTEGER NOT NULL,
    representante_legal   INTEGER NOT NULL,
    nombre                VARCHAR(30) NOT NULL,
    direccion             VARCHAR(100) NOT NULL,
    telefono              VARCHAR(10) NOT NULL,
    celular               VARCHAR(15) NOT NULL,
    correo                VARCHAR(30) NOT NULL,
    usuario               VARCHAR(30) NOT NULL,
    municipio             INTEGER NOT NULL,
    CONSTRAINT cda_pk PRIMARY KEY ( nit )
);

CREATE TABLE ciudadano (
    numero_identidad       VARCHAR(10) NOT NULL,
    tipo_documento_id      INTEGER NOT NULL,
    nombres                VARCHAR(30) NOT NULL,
    apellidos              VARCHAR(30) NOT NULL,
    fecha_exp_identidad    DATE NOT NULL,
    tipo_sangre_id         INTEGER NOT NULL,
    genero_id              INTEGER NOT NULL,
    direccion              VARCHAR(100) NOT NULL,
    correo                 VARCHAR(30) NOT NULL,
    telefono               VARCHAR(10) NOT NULL,
    celular                VARCHAR(15) NOT NULL,
    licencia               VARCHAR(10) NOT NULL,
    municipio              INTEGER NOT NULL,
    municipio_nacimiento   INTEGER NOT NULL,
    usuario                VARCHAR(30) NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY ( numero_identidad )
);

CREATE TABLE clase_vehiculo (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(20) NOT NULL,
    CONSTRAINT clase_vehiculo_pk PRIMARY KEY ( id )
);

CREATE TABLE color (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(30) NOT NULL,
    CONSTRAINT color_pk PRIMARY KEY ( id )
);

CREATE TABLE comparendo (
    id                           INTEGER NOT NULL auto_increment,
    tipo_infraccion              INTEGER NOT NULL,
    municipio                    INTEGER NOT NULL,
    fecha_hora                   DATE NOT NULL,
    licencia_cond_num_lic_cond   VARCHAR(10),
    CONSTRAINT comparendo_pk PRIMARY KEY ( id )
);

CREATE TABLE comparendo_usuario (
    id                    INTEGER NOT NULL auto_increment,
    usuario_numero_iden   VARCHAR(10) NOT NULL,
    comparendo_id         INTEGER NOT NULL,
    CONSTRAINT comparendo_usuario_pk PRIMARY KEY ( id )
);

CREATE TABLE departamento (
    id        INTEGER NOT NULL auto_increment,
    nombre    VARCHAR(30) NOT NULL,
    pais_id   INTEGER NOT NULL,
    CONSTRAINT departamento_pk PRIMARY KEY ( id )
);

CREATE TABLE genero (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(10) NOT NULL,
    CONSTRAINT genero_pk PRIMARY KEY ( id )
);

CREATE TABLE licencia_categorias (
    id                            INTEGER NOT NULL auto_increment,
    licencia_cond_num_lica_cond   VARCHAR(10) NOT NULL,
    categorias_licencia_id        INTEGER NOT NULL,
    CONSTRAINT licencia_categorias_pk PRIMARY KEY ( id )
);

CREATE TABLE licencia_condiccion (
    num_licencia_cond       VARCHAR(10) NOT NULL,
    fecha_expedicion        DATE NOT NULL,
    restriccion_conductor   VARCHAR(200) NOT NULL,
    organismo_expedidor     VARCHAR(50) NOT NULL,
    CONSTRAINT licencia_condiccion_pk PRIMARY KEY ( num_licencia_cond )
);

CREATE TABLE login (
    usuario        VARCHAR(30) NOT NULL,
    contrasenia    VARCHAR(30) NOT NULL,
    tipo_usuario   INTEGER NOT NULL,
    CONSTRAINT login_ase_cda_pk PRIMARY KEY ( usuario )
);

CREATE TABLE marca (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(20) NOT NULL,
    CONSTRAINT marca_pk PRIMARY KEY ( id )
);

CREATE TABLE modelo (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(20) NOT NULL,
    CONSTRAINT modelo_pk PRIMARY KEY ( id )
);

CREATE TABLE municipio (
    id                INTEGER NOT NULL auto_increment,
    nombre            VARCHAR(30) NOT NULL,
    departamento_id   INTEGER NOT NULL,
    CONSTRAINT municipio_pk PRIMARY KEY ( id )
);

CREATE TABLE pais (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(30) NOT NULL,
    CONSTRAINT pais_pk PRIMARY KEY ( id )
);

CREATE TABLE poliza (
    id               VARCHAR(20) NOT NULL,
    vehiculo_placa   VARCHAR(6) NOT NULL,
    CONSTRAINT poliza_pk PRIMARY KEY ( id )
);

CREATE TABLE propietario (
    id          INTEGER NOT NULL auto_increment,
    ciudadano   VARCHAR(10),
    CONSTRAINT propietario_pk PRIMARY KEY ( id )
);

CREATE TABLE revision_tecno (
    id                 INTEGER NOT NULL auto_increment,
    cda_nit            INTEGER NOT NULL,
    fecha_expedicion   DATE NOT NULL,
    fecha_final        DATE NOT NULL,
    vigencia           CHAR(1) NOT NULL,
    vehiculo_placa     VARCHAR(6) NOT NULL,
    CONSTRAINT revision_tecno_pk PRIMARY KEY ( id )
);

CREATE TABLE seguro (
    id                 INTEGER NOT NULL auto_increment,
    aseguradora        INTEGER NOT NULL,
    nombre             VARCHAR(30) NOT NULL,
    poliza             VARCHAR(20) NOT NULL,
    fecha_expedicion   DATE NOT NULL,
    fecha_inicio       DATE NOT NULL,
    fecha_final        DATE NOT NULL,
    estado             CHAR(1) NOT NULL,
    CONSTRAINT seguro_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_combustible (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(10) NOT NULL,
    CONSTRAINT tipo_combustible_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_documento (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(20) NOT NULL,
    CONSTRAINT tipo_documento_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_infraccion (
    id                        INTEGER NOT NULL auto_increment,
    nombre                    VARCHAR(30) NOT NULL,
    costo                     INTEGER NOT NULL,
    inmovilizacion_licencia   CHAR(1) NOT NULL,
    suspencion_licencia       CHAR(1) NOT NULL,
    CONSTRAINT tipo_infraccion_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_sangre (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(4) NOT NULL,
    CONSTRAINT tipo_sangre_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_servicio (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(12) NOT NULL,
    CONSTRAINT tipo_servicio_pk PRIMARY KEY ( id )
);

CREATE TABLE tipo_usuario (
    id       INTEGER NOT NULL auto_increment,
    nombre   VARCHAR(30) NOT NULL,
    CONSTRAINT tipo_usuario_pk PRIMARY KEY ( id )
);

CREATE TABLE vehiculo (
    placa                 VARCHAR(6) NOT NULL,
    licencia_transito     VARCHAR(20) NOT NULL,
    tipo_servicio         INTEGER NOT NULL,
    clase_vehiculo1       INTEGER NOT NULL,
    estado_vehiculo       CHAR(1) NOT NULL,
    marca_id              INTEGER NOT NULL,
    modelo_id             INTEGER NOT NULL,
    color_id              INTEGER NOT NULL,
    numero_chasis         VARCHAR(20) NOT NULL,
    cilindrage            VARCHAR(5) NOT NULL,
    tipo_combustible_id   INTEGER NOT NULL,
    fecha_matricula       DATE NOT NULL,
    num_pasajeros         VARCHAR(4) NOT NULL,
    propietario_id        INTEGER NOT NULL,
    CONSTRAINT vehiculo_pk PRIMARY KEY ( placa )
);

ALTER TABLE aseguradora
    ADD CONSTRAINT aseguradora_login_ase_cda_fk FOREIGN KEY ( usuario )
        REFERENCES login ( usuario );

ALTER TABLE aseguradora
    ADD CONSTRAINT aseguradora_municipio_fk FOREIGN KEY ( municipio )
        REFERENCES municipio ( id );

ALTER TABLE cda
    ADD CONSTRAINT cda_login_ase_cda_fk FOREIGN KEY ( usuario )
        REFERENCES login ( usuario );

ALTER TABLE cda
    ADD CONSTRAINT cda_municipio_fk FOREIGN KEY ( municipio )
        REFERENCES municipio ( id );

ALTER TABLE comparendo
    ADD CONSTRAINT comparendo_licencia_condi_fk FOREIGN KEY ( licencia_cond_num_lic_cond )
        REFERENCES licencia_condiccion ( num_licencia_cond );

ALTER TABLE comparendo
    ADD CONSTRAINT comparendo_municipio_fk FOREIGN KEY ( municipio )
        REFERENCES municipio ( id );

ALTER TABLE comparendo
    ADD CONSTRAINT comparendo_tipo_infraccion_fk FOREIGN KEY ( tipo_infraccion )
        REFERENCES tipo_infraccion ( id );

ALTER TABLE comparendo_usuario
    ADD CONSTRAINT comparendo_usu_comp_fk FOREIGN KEY ( comparendo_id )
        REFERENCES comparendo ( id );

ALTER TABLE comparendo_usuario
    ADD CONSTRAINT comparendo_usu_usu_fk FOREIGN KEY ( usuario_numero_iden )
        REFERENCES ciudadano ( numero_identidad );

ALTER TABLE departamento
    ADD CONSTRAINT departamento_pais_fk FOREIGN KEY ( pais_id )
        REFERENCES pais ( id );

ALTER TABLE licencia_categorias
    ADD CONSTRAINT licencia_cat_cat_lic_fk FOREIGN KEY ( categorias_licencia_id )
        REFERENCES categorias_licencia ( id );

ALTER TABLE licencia_categorias
    ADD CONSTRAINT licencia_cat_lic_cond_fk FOREIGN KEY ( licencia_cond_num_lica_cond )
        REFERENCES licencia_condiccion ( num_licencia_cond );

ALTER TABLE login
    ADD CONSTRAINT login_tipo_usuario_fk FOREIGN KEY ( tipo_usuario )
        REFERENCES tipo_usuario ( id );

ALTER TABLE municipio
    ADD CONSTRAINT municipio_departamento_fk FOREIGN KEY ( departamento_id )
        REFERENCES departamento ( id );

ALTER TABLE poliza
    ADD CONSTRAINT poliza_vehiculo_fk FOREIGN KEY ( vehiculo_placa )
        REFERENCES vehiculo ( placa );

ALTER TABLE propietario
    ADD CONSTRAINT propietario_ciudadano_fk FOREIGN KEY ( ciudadano )
        REFERENCES ciudadano ( numero_identidad );

ALTER TABLE revision_tecno
    ADD CONSTRAINT revision_tecno_cda_fk FOREIGN KEY ( cda_nit )
        REFERENCES cda ( nit );

ALTER TABLE revision_tecno
    ADD CONSTRAINT revision_tecno_vehiculo_fk FOREIGN KEY ( vehiculo_placa )
        REFERENCES vehiculo ( placa );

ALTER TABLE seguro
    ADD CONSTRAINT seguro_aseguradora_fk FOREIGN KEY ( aseguradora )
        REFERENCES aseguradora ( nit );

ALTER TABLE seguro
    ADD CONSTRAINT seguro_poliza_fk FOREIGN KEY ( poliza )
        REFERENCES poliza ( id );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_genero_fk FOREIGN KEY ( genero_id )
        REFERENCES genero ( id );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_licencia_condiccion_fk FOREIGN KEY ( licencia )
        REFERENCES licencia_condiccion ( num_licencia_cond );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_login_ase_cda_fk FOREIGN KEY ( usuario )
        REFERENCES login ( usuario );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_municipio_fk FOREIGN KEY ( municipio )
        REFERENCES municipio ( id );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_municipio_fkv2 FOREIGN KEY ( municipio_nacimiento )
        REFERENCES municipio ( id );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_tipo_documento_fk FOREIGN KEY ( tipo_documento_id )
        REFERENCES tipo_documento ( id );

ALTER TABLE ciudadano
    ADD CONSTRAINT usuario_tipo_sangre_fk FOREIGN KEY ( tipo_sangre_id )
        REFERENCES tipo_sangre ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_clase_vehiculo_fk FOREIGN KEY ( clase_vehiculo1 )
        REFERENCES clase_vehiculo ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_color_fk FOREIGN KEY ( color_id )
        REFERENCES color ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_marca_fk FOREIGN KEY ( marca_id )
        REFERENCES marca ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_modelo_fk FOREIGN KEY ( modelo_id )
        REFERENCES modelo ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_propietario_fk FOREIGN KEY ( propietario_id )
        REFERENCES propietario ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_tipo_combustible_fk FOREIGN KEY ( tipo_combustible_id )
        REFERENCES tipo_combustible ( id );

ALTER TABLE vehiculo
    ADD CONSTRAINT vehiculo_tipo_servicio_fk FOREIGN KEY ( tipo_servicio )
        REFERENCES tipo_servicio ( id );
