-- Region de cadana
SELECT region_name
FROM regions NATURAL JOIN countries
WHERE country_name = 'Canada';

DESC regions;
DESC countries;

SELECT country_name
FROM countries NATURAL JOIN regions
WHERE region_name = 'Americas';

SELECT region_name
FROM regions JOIN countries
USING(region_id)
WHERE country_name = 'Canada';

SELECT country_name
FROM countries JOIN regions
ON (countries.region_id = regions.region_id)
WHERE region_name = 'Americas';

SELECT COUNT(*) FROM countries; -- 25
SELECT COUNT(*) FROM regions; -- 4

SELECT * FROM regions CROSS JOIN countries;
SELECT COUNT(*) FROM regions CROSS JOIN countries;