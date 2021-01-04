-- ABS(n)
SELECT ABS(-52) AS "negative", ABS(52) AS "positive", ABS(0) AS "zero"
FROM DUAL;

-- ACOS(n), ASIN(n), ATAN(n), COS(n), SIN(n), TAN(n)
SELECT ACOS(-1), ACOS(0), ACOS(.045) FROM DUAL;

-- CEIL(n)
SELECT CEIL(9.8), CEIL(-32.85), CEIL(0), CEIL(5)
FROM DUAL;

-- EXP(n)
SELECT EXP(1) "e" FROM DUAL;

-- FLOOR(n)
SELECT FLOOR(9.8), FLOOR(-32.85), FLOOR(137)
FROM DUAL;

-- LN(n)
SELECT LN(2.7) FROM DUAL;

-- POWER(n1, n2)
SELECT POWER(2,10), POWER(3, 3), POWER(5, 3), POWER(2, -3)
FROM DUAL;

-- SIGN(n)
SELECT SIGN(-2.3), SIGN(0), SIGN(47) FROM DUAL;
