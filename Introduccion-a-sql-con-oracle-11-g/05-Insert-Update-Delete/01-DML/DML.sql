CREATE TABLE personas(
    id INTEGER NOT NULL,
    nombre VARCHAR2(50),
    edad INTEGER
); 

INSERT INTO personas(id, nombre, edad)
VALUES(1, 'Juan', 28);

INSERT INTO personas VALUES(2, 'Carlos', 31);

INSERT INTO personas (id, nombre) VALUES (3, 'Maria');

INSERT INTO personas (id, edad) VALUES (4, 27);

SELECT * FROM personas;

UPDATE personas
SET edad = 38 
WHERE id = 3;

UPDATE personas
SET nombre = 'Alfonso' 
WHERE id = 4;

UPDATE personas
SET nombre = 'Pedro IV',
    edad = 42
WHERE id = 4;

/*
UPDATE personas
SET edad = NULL;
*/

/*
DELETE FROM personas
WHERE nombre = 'Alfonso';
*/

/*
DELETE FROM personas;
*/