-- INSTR(cadena1, cadena2) devolver la posicion donde se encuentra la cadena
SELECT INSTR('Hola mundo', 'mu') AS "N° de caracteres" FROM DUAL;
SELECT INSTR('Otra cadena', 'no existe') AS "N° de caracteres" FROM DUAL;

-- Devolver la posicion
SELECT SYSDATE, INSTR(SYSDATE, '15') AS "Posicion" FROM DUAL;

SELECT INSTR('1#3#5#7#9#', '#', 3, 4) AS "Posicion" FROM DUAL;

-- Buscar una cadena que tenga el dato en la posicion y ocurrencia asignada
SELECT * FROM departments
WHERE INSTR(department_name, 'on') = 2;