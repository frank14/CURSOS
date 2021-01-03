-- Ordenar Alfabeticamente
SELECT * FROM countries
ORDER BY region_id, country_name;

-- Ordenar de acuerdo a un criterio en especifico 
SELECT first_name || ' ' || last_name AS "Employee name"
FROM employees
WHERE department_id = 90
ORDER BY last_name;

-- Ordenar de forma descendente
SELECT last_name AS "Apellido"
FROM employees
ORDER BY last_name DESC;

-- Ordenar dos columnas de forma diferente
SELECT last_name AS "Apellido", first_name AS "Nombre"
FROM employees
ORDER BY last_name DESC, first_name ASC;

-- Ordenar columnas segun su orden
SELECT first_name AS "Nombre", hire_date AS "Fecha de contratacion", salary AS "Salario", manager_id AS "mid"
FROM employees
WHERE department_id IN (110,100)
ORDER BY 4, 2, 3;

-- Ordenar de acuerdo a su valor null
SELECT last_name, commission_pct
FROM employees
WHERE last_name LIKE 'R%'
ORDER BY commission_pct ASC, last_name DESC;