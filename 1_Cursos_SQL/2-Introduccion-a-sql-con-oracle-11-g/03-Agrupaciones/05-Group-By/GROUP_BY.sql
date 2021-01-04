-- Parte 1
SELECT AVG(salary), department_id
FROM employees
GROUP BY department_id
ORDER BY 1 DESC;

SELECT COUNT(*), manager_id
FROM employees
GROUP BY manager_id
ORDER BY 1 DESC, 2 NULLS LAST;

SELECT MAX(salary), COUNT(*)
FROM employees
GROUP BY department_id
ORDER BY department_id;

SELECT COUNT(*), region_id
FROM countries
GROUP BY region_id
ORDER BY region_id ASC;

SELECT TO_CHAR(end_date, 'YYYY') AS "Año",
    COUNT(*) AS "Empleados"
FROM job_history
GROUP BY TO_CHAR(end_date, 'YYYY')
ORDER BY COUNT(*) DESC;

SELECT end_date, COUNT(*)
FROM job_history
GROUP BY end_date;

SELECT end_date, start_date ,COUNT(*)
FROM job_history
GROUP BY end_date, start_date ;

-- Parte 2
SELECT department_id, SUM(commission_pct)
FROM employees
WHERE commission_pct IS NOT NULL
GROUP BY department_id;

SELECT department_id, job_id, SUM(commission_pct)
FROM employees
WHERE commission_pct IS NOT NULL
GROUP BY department_id, job_id;

--Ejercicio
SELECT TO_CHAR(end_date, 'YYYY'), job_id, COUNT(*) 
FROM job_history
GROUP BY TO_CHAR(end_date, 'YYYY'), job_id
ORDER BY COUNT(*) DESC;

SELECT MAX(LENGTH(last_name)), MIN(LENGTH(last_name))
FROM employees
WHERE job_id = 'SA_REP'; 