-- LENGTH(c)
SELECT LENGTH('esta es una cadena') AS "Longitud de cadena" FROM DUAL;

SELECT LENGTH('1 + 2 = ' || 3) AS "Longitud concatenada" FROM DUAL; 

-- dd/mm/yy
SELECT LENGTH(SYSDATE) FROM DUAL;

-- Filtrar por longitud de caracteres
SELECT * FROM countries
WHERE LENGTH(country_name) <= 10;