-- Concatenar
SELECT 'Esta es una cadena' || ' otra cadena' FROM dual;

-- CONCAT(x, y)
SELECT CONCAT('Esta es una cadena', ' otra cadena') AS "Concatenando" FROM dual;
SELECT CONCAT(CONCAT('UNO', ' DOS'), ' TRES') AS "Concatenando" FROM dual;

-- Concatenando datos en tablas diferentes
SELECT CONCAT(CONCAT(first_name, ' '), last_name) AS "Nombre empleado 1", 
    first_name || ' ' || last_name AS "Nombre empleado 2" 
FROM employees
WHERE department_id = 30;
