-- SUBSTR(cadena1, numero x, [,posicion y opcional]
SELECT SUBSTR('CADENA MUY LARGA DE EJEMPLO', 10) AS "Recorte" FROM DUAL;

SELECT SUBSTR('CADENA MUY LARGA DE EJEMPLO', 10, 7) AS "Recorte" FROM DUAL;

-- Recortar caracteres 9992
SELECT SUBSTR(10000 - 8, 3, 2) FROM DUAL;

-- dd/mm/yy
SELECT SYSDATE AS "Fecha del sistema", SUBSTR(SYSDATE, 4, 3) AS "Recorte" FROM dual;

-- Recortando
SELECT SUBSTR('1#3#5#7#9', 5) AS "Recorte" FROM DUAL;

SELECT SUBSTR('1#3#5#7#9', 2, 6) AS "Recorte" FROM DUAL;

-- Sacando la inicial del nombre del usuario
SELECT 'Nombre:' || SUBSTR(first_name, 1, 1)
    || '. ' || last_name "Nombre"
FROM employees
WHERE SUBSTR(job_id, 1, 2) = 'AD';
