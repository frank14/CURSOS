-- TO_CHAR(expr[, fmt[, n1sparam]])
SELECT TO_CHAR(10) FROM DUAL;
SELECT TO_CHAR(000001, '0999999') FROM DUAL;

SELECT job_title, max_salary, TO_CHAR(max_salary, '$99,999.99'),
    TO_CHAR(max_salary, '$9,999.99')
FROM jobs
WHERE UPPER(job_title) LIKE '%PRESIDENT%';

SELECT TO_CHAR(SYSDATE) FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'DAY') FROM DUAL;

SELECT last_name, TO_CHAR(hire_date, 'fmDD Month YYYY') "Hire date"
FROM employees;

SELECT TO_CHAR(SYSDATE, 'DAY Ddspth, Month YYYY', 'nls_date_language=German')
FROM DUAL;