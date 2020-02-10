-- Concatenando columnas donde departamento es igual a un criterio en especifico
SELECT first_name || ' ' || last_name AS "Name", department_id AS "ID departamento"
FROM employees
WHERE department_id = 80;

-- Saber la informacion correspondiente al dato consultado
SELECT department_name 
FROM departments
WHERE department_id = 90;

-- Describir columna
DESC job_history;

-- Mostrando datos correspondiente al campo solicitado
SELECT * FROM job_history
WHERE job_id = 'AC_ACCOUNT';

SELECT * FROM countries
WHERE region_id = 4;

-- Describiendo tabla
DESC regions;

-- Mostrando datos correspondiente al campo solicitado
SELECT region_name
FROM regions
WHERE region_id = 4;

-- Diferente: <>, !=, ^=
-- Menor que: <
-- Menor o igual que: <=
-- Mayor que: >
-- mayor o igual que: >=

-- Obteninedo los datos que cumplan con la condicion dada
SELECT first_name || ' ' || last_name AS "Name", department_id AS "ID departamento", commission_pct
FROM employees
WHERE commission_pct != 0.35;

-- IN definir valores
SELECT first_name || ' ' || last_name AS "Name", department_id AS "ID departamento"
FROM employees
WHERE department_id IN(10, 20, 50);



