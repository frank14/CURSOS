-- SUM([DISTINCT|ALL] expresión);

SELECT SUM(salary) FROM employees;

SELECT salary FROM employees WHERE salary IS NULL;

SELECT SUM(5) FROM employees;

SELECT 5 * COUNT(*) FROM employees;

SELECT SUM(DISTINCT salary) FROM employees;

SELECT SUM(DISTINCT commission_pct) FROM employees;

SELECT ROUND(SUM(SYSDATE - hire_date) / 365.25) AS "Total de años trabajados"
FROM employees;

SELECT SUM(first_name)
FROM employees;