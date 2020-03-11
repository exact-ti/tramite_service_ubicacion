

INSERT INTO tipo_sede (nombre) VALUES ('SEDE')
INSERT INTO tipo_sede (nombre) VALUES ('SEDE EXTERNA')


INSERT INTO sede (nombre, codigo, tipo_sede_id) VALUES ('LIMA', 'LOP01', 1)
INSERT INTO sede (nombre, codigo, tipo_sede_id) VALUES ('SAN ISIDRO', 'SIS01', 1)
INSERT INTO sede (nombre, codigo, tipo_sede_id) VALUES ('ATE', 'ATE01', 1)
INSERT INTO sede (nombre, codigo, tipo_sede_id) VALUES ('PROVINCIA', 'PRO01', 2)


INSERT INTO area (nombre, codigo, sede_id) VALUES ('SISTEMAS', '515T3M45', 1)
INSERT INTO area (nombre, codigo, sede_id) VALUES ('COMERCIAL', 'C0M3RC14L', 2)
INSERT INTO area (nombre, codigo, sede_id) VALUES ('ADMINISTRACION', '4DM1N15TR4C10N', 3)


INSERT INTO sede_externa (sede_responsable_id, sede_id) VALUES (3, 4)