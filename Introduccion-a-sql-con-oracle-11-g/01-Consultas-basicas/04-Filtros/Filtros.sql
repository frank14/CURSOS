-- Filtro NOT
SELECT first_name, department_id
FROM employees
WHERE NOT(department_id >= 30);

-- Filtro AND
SELECT first_name, salary
FROM employees
WHERE last_name = 'Smith' AND salary > 7500;

-- Filtro OR
SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE first_name = 'Kelly' OR last_name = 'Smith';

-- Filtro BETWEEN
SELECT first_name AS "Nombre", last_name AS "Apellido", salary AS "Salario"
FROM employees
WHERE salary BETWEEN 5000 AND 6000;

-- Filtro LIKE (Empieza, Termina, Contiene al menos 1 vez el caracter dado)
SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE first_name LIKE 'Su%';

SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE first_name LIKE '%a';

SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE first_name LIKE '%m%';

-- % Comodin reemplazar 0 o mas caracteres

-- Seleccionar los valores que estan NULL
SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE department_id IS NULL;

-- Seleccionar los valores que no estan NULL
SELECT first_name AS "Nombre", last_name AS "Apellido"
FROM employees
WHERE department_id IS NOT NULL;
