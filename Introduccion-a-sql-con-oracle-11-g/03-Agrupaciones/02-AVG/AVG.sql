-- AVG([DISTINCT|ALL] expresion)

SELECT AVG(5) FROM employees;

SELECT TRUNC(AVG(salary)) FROM employees;

SELECT TRUNC(AVG(DISTINCT salary), 1) FROM employees;

SELECT AVG(commission_pct) FROM employees;

SELECT last_name, job_id, ROUND((SYSDATE - hire_date) / 365.25) AS "Años trabajados"
FROM employees
WHERE job_id = 'IT_PROG';

SELECT ROUND(AVG(SYSDATE - hire_date) / 365.25) AS "PRomedio de Años trabajados"
FROM employees
WHERE job_id = 'IT_PROG';