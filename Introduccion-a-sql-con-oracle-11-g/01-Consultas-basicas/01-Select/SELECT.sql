-- Seleccionar una tabla
SELECT * FROM jobs; 

-- Describir datos en una tabla
DESC jobs;

-- Informacion detallada en una tabla
INFO jobs;

-- Seleccionar columnas especificas dentro de una tabla
SELECT job_id FROM jobs;

SELECT job_id, min_salary
FROM jobs;

-- Especificando alias de columnas
SELECT job_id AS "Job", min_salary AS "minimum_salary" 
FROM jobs;

-- Describir una tabla
DESC employees;

-- Seleccionar una tabla
SELECT department_id AS "ID Departamento" 
FROM employees;

-- Seleccionar los resultados distintos deacuerdo al contenido de las columnas
SELECT DISTINCT department_id AS "ID Departamento" 
FROM employees;

-- Seleccionar los resultados distintos deacurdo al contenido de cada grupo
SELECT DISTINCT department_id AS "ID Departamento", job_id AS "ID Trabajo" 
FROM employees;

-- Seleccionar toda la informacion de una tabla
SELECT * FROM countries;

SELECT * FROM regions;

