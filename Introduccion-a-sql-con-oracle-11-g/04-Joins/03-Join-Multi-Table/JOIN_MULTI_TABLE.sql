-- departments, location, countries, regions
SELECT d.department_name, l.city, c.country_name, r.region_name
FROM departments d
NATURAL JOIN locations l
NATURAL JOIN countries c
NATURAL JOIN regions r;

DESC departments;

SELECT d.department_name, l.city, c.country_name, r.region_name
FROM departments d
JOIN locations l ON (d.location_id = l.location_id)
JOIN countries c ON (l.country_id = c.country_id)
JOIN regions r ON (c.region_id = r.region_id);

SELECT d.department_name, l.city, c.country_name, r.region_name
FROM departments d
JOIN locations l USING(location_id)
JOIN countries c USING(country_id)
JOIN regions r USING(region_id);

SELECT d.department_id, l.city, d.department_name
FROM departments d
JOIN locations l ON l.location_id = d.location_id 
WHERE d.department_name LIKE 'P%';

