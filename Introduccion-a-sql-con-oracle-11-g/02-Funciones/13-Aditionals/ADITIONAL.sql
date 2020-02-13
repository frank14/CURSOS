-- DECODE(x, m1, r1, m2, r2, m3, r3...)
SELECT country_id, country_name, region_id,
    DECODE(region_id, 1, 'Europa',
                     2, 'América',
                     3, 'Asia',
                        'Otro') Region
FROM countries;

-- GREATEST(lista de expresiones)

SELECT GREATEST('01-APR-08', ' 30-DIC-08', '20-ENE-10') FROM DUAL;

SELECT GREATEST('XYZ', 345, 234) FROM DUAL;

SELECT last_name, salary, GREATEST(salary * 0.15, 500) AS "bono"
FROM employees
WHERE department_id IN (30,10)
ORDER BY last_name;

SELECT LEAST(SYSDATE, '15-MAR-2002', '17-JUN-2002') FROM DUAL;
