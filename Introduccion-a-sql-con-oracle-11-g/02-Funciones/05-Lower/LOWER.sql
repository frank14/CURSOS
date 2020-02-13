-- LOWER(c)
SELECT LOWER('hOLa munDo') AS "Minuscula" FROM DUAL;

SELECT LOWER(30 + 50) AS "Suma" FROM DUAL;

SELECT LOWER('La suma' || ' 10 + 10 ' || '=' || ' 20')
FROM DUAL;

SELECT LOWER(SYSDATE) AS "Fecha" FROM DUAL;

SELECT first_name, last_name, LOWER(last_name)
FROM employees
WHERE LOWER(last_name) LIKE '%ur%';