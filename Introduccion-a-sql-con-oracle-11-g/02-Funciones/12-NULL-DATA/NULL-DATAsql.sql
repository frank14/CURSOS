-- NVL, NVL2, COALSCE

-- NVL(x1, x2)
SELECT last_name, NVL(department_id, 0)
FROM employees
ORDER BY 2;

SELECT first_name, salary, NVL(commission_pct, 0),
    salary + (salary * NVL(commission_pct,0)) AS "Compensación"
FROM employees
WHERE first_name LIKE 'T%';

-- NVL2(x1, x2, x3)
SELECT first_name, salary, commission_pct,
    NVL2(commission_pct, salary + salary * commission_pct, salary) AS "Compesación"
FROM employees
WHERE first_name LIKE 'T%';

-- COALSCE(lista)
/* COALESCE(x1, x2, x3) */
SELECT last_name, salary, commission_pct AS "comm",
COALESCE(salary + salary * commission_pct, salary + 100, 900) AS "Comisión"
FROM employees
WHERE last_name LIKE 'T%';