-- LPAD(cadena, i[, cadena2])
SELECT LPAD('cadena', 10), RPAD('cadena',10) FROM DUAL;

SELECT LPAD('aaaaa', 15, '*'), RPAD('aaaaa', 15, '*') FROM DUAL;

SELECT LPAD(SYSDATE, 14, '-?'), RPAD(SYSDATE, 14, '-?') FROM DUAL;

SELECT LPAD(last_name, 10)  lpad_name,
    LPAD(salary, 8, '*') lpad_salary
FROM employees
WHERE last_name LIKE 'J%';