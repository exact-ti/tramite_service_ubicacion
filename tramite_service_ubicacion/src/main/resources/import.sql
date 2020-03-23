-- CATALOGO --

INSERT INTO tipo_sede (nombre) VALUES ('SEDE')
INSERT INTO tipo_sede (nombre) VALUES ('SEDE EXTERNA')




-- IMPORT --

INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('SAN ISIDRO','S00001',1);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('SAN BORJA','S00002',1);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('LIMA','S00003',1);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('ATE','S00004',1);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('LA MOLINA','S00005',1);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('LOS OLIVOS','194037',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('COMAS','194038',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('LAMPA','194039',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('SAN FELIPE','194040',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('SAN BORJA','194041',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('BARRANCA','200000',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('PIURA','200001',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('PAITA','200002',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('TUMBES','200003',2);
INSERT INTO sede(nombre,codigo,tipo_sede_id) VALUES('CHICLAYO','200004',2);

INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(6,1);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(7,1);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(8,1);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(9,1);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(10,1);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(11,2);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(12,2);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(13,2);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(14,2);
INSERT INTO sede_externa(sede_id,sede_responsable_id) VALUES(15,2);

INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('COMERCIAL','2','C000052',1);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('CONTABILIDAD','3','C000053',1);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('SEGURIDAD','4','C000054',2);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('REDES','2','C000055',2);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('DESARROLLO','1','C000056',3);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('INNOVACIÓN','8','C000057',3);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('RRRHH','5','C000058',4);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('ADMINISTRACIÓN','3','C000059',4);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('DIGITALIZACIÓN','6','C000060',5);
INSERT INTO area(nombre,piso,codigo,sede_id) VALUES('TALENTO NUEVO','2','C000061',5);




