-- Natural Join
/* SELECT table.column, table2.column
FROM table1
NATURAL JOIN table2; */

SELECT * 
FROM locations NATURAL JOIN countries;

SELECT l.street_address, l.city, c.country_name
FROM locations l, countries c
WHERE l.country_id = c.country_id;

SELECT *
FROM jobs NATURAL JOIN countries;

DESC jobs;
DESC countries;

SELECT *
FROM jobs, countries;

-- Ejercicio
SELECT employee_id, job_id, department_id,
    e.last_name, e.hire_date, jh.end_date
FROM job_history jh NATURAL JOIN employees e;