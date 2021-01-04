-- Incluir operaciones aritmeticas
SELECT 3 * 4 FROM employees;

SELECT * FROM dual;

SELECT 3 * 4 AS "Resultado" FROM dual;

-- Hola mundo en sql
SELECT 'Hola mundo' AS "Saludo" 
FROM dual;

-- Mostrar fecha del sistema
SELECT SYSDATE FROM dual;

-- Mostrar usuario del sistema
SELECT USER FROM dual;

-- Concatenando cadenas
SELECT 'Esta es una cadena' || ' ' || 'otra cadena de prueba' 
FROM dual;

-- Concatenando informacion del sistema
SELECT 'Usuario: ' || USER || ', el dia de hoy es: ' || SYSDATE AS "Encabezado"
FROM dual;

SELECT 'I''m ' || USER AS "Yo soy" FROM dual;

