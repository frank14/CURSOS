# Introducción A SQL Con Oracle 11 g

## Instrucciones

### SELECT

La instrucción SELECT se usa para seleccionar datos de una base de datos.

Los datos devueltos se almacenan en una tabla de resultados, llamada conjunto de resultados.

```
SELECT column1, column2, ...
FROM table_name; 
```

### SELECT DISTINCT

La instrucción SELECT DISTINCT se usa para devolver solo valores distintos (diferentes).

Dentro de una tabla, una columna a menudo contiene muchos valores duplicados; y a veces solo desea enumerar los diferentes valores (distintos).

```
SELECT DISTINCT column1, column2, ...
FROM table_name; 
```

### WHERE

La cláusula WHERE se usa para filtrar registros.

La cláusula WHERE se usa para extraer solo aquellos registros que cumplen una condición específica.

```
SELECT column1, column2, ...
FROM table_name
WHERE condition; 
```

### SQL IN

El operador IN le permite especificar múltiples valores en una cláusula WHERE.

El operador IN es una abreviatura para múltiples condiciones OR.

```
SELECT column_name(s)
FROM table_name
WHERE column_name IN (value1, value2, ...); 
```

O:

```
SELECT column_name(s)
FROM table_name
WHERE column_name IN (SELECT STATEMENT); 
```

### SQL operadores AND, OR, NOT

La cláusula WHERE se puede combinar con operadores AND, OR y NOT.

Los operadores AND y OR se utilizan para filtrar registros en función de más de una condición:

    - El operador AND muestra un registro si todas las condiciones separadas por AND son VERDADERAS.
    - El operador OR muestra un registro si alguna de las condiciones separadas por OR es VERDADERA.

El operador NOT muestra un registro si la (s) condición (es) NO ES VERDADERA.

**AND Sintaxis**

```
SELECT column1, column2, ...
FROM table_name
WHERE condition1 AND condition2 AND condition3 ...; 
```

**OR Sintaxis**

```
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...; 
```

**NOT Sintaxis**

```
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition; 
```

### SQL BETWEEN

El operador ENTRE selecciona valores dentro de un rango dado. Los valores pueden ser números, texto o fechas.

El operador ENTRE es inclusivo: se incluyen valores iniciales y finales.

```
SELECT column_name(s)
FROM table_name
WHERE column_name BETWEEN value1 AND value2; 
```

### SQL LIKE

El operador LIKE se usa en una cláusula WHERE para buscar un patrón específico en una columna.

Hay dos comodines que se usan con frecuencia junto con el operador LIKE:

    - % El signo de porcentaje representa cero, uno o varios caracteres
    - _ El guión bajo representa un solo carácter

```
SELECT column1, column2, ...
FROM table_name
WHERE columnN LIKE pattern; 
```
### SQL LENGTH 

La función length permite obtener el valor de la longitud de la cadena de caracteres de un campo en específico.

```
SELECT LENGTH(VALUE) FROM DUAL;

SELECT * FROM tabla
WHERE LENGTH(columna) <= 10; 
```

### SQL LOWER 

La función lower permite poner en mínusculas el valor de la longitud de la cadena de caracteres de un campo en específico.

```
SELECT LENGTH(VALUE) FROM DUAL;

SELECT * FROM tabla
WHERE LENGTH(columna) <= 10; 
```

## Operaciones

### Dual

Es una tabla que posee un unico campo el cual puede ser utilizado para dar respuestas puntuales a una consulta u operacion aritmetica.

## Comparaciones

```
Diferente: <>, !=, ^=
Menor que: <
Menor o igual que: <=
Mayor que: >
mayor o igual que: >=
```