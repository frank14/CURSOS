-- REPLACE(cadena1, cadena2[,cadena3])
SELECT REPLACE('downtown', 'down', 'up') FROM DUAL;
SELECT REPLACE('downtown', 'down') FROM DUAL;

-- 9997
SELECT REPLACE(10000 - 3, '9', '85') FROM DUAL;

SELECT REPLACE(SYSDATE, '01', '08') FROM DUAL;

SELECT last_name, salary, REPLACE(salary, '0', '000') "Salario soñado"
FROM employees
WHERE job_id = 'SA_MAN';





