#Boletín de ejercicios de Arrays
Ejercicios no obligatorios para practicar Arrays en clase


## Ejercicio 1

Construir un programa que pida al usuario dos vectores de números enteros v1 y v2,
 y que construya un nuevo vector del resultado de "concatenar" los vectores v1 y v2.
  Es decir, colocar los elementos de v2 a continuación de los de v1 y, finalmente,
  mostrar el resultado de la concatenación por pantalla.
  
## Ejercicio 2
Desarrollar un programa en el que se pidan al usuario un vecto
r de n ́umeros enteros e indique en pantalla si
dicho vector es capicúa, es decir, la secuencia de sus eleme
ntos es igual vista de delante hacia atrás y de detr ́as
hacia delante.

## Ejercicio 3
Desarrollar un programa en el que se pidan al usuario dos vect
ores de números enteros e indique en pantalla
si son proporcionales o no. (Dos vectores son proporcionale
s si uno de ellos es el resultado de multiplicar por
un mismo factor todos los elementos del otro). Si los vectore
s proporcionados no tienen la misma longitud, se
ha de escribir en pantalla un mensaje indicándolo.

## Ejercicio 4
Desarrollar un programa en el que se pida al usuario un vector
de n ́umeros enteros
v
y se construya un
nuevo vector
u
con los mismos elementos que
v
pero en el que los números negativos preceden a los positivo
s.
Por ejemplo, si
v
= [
−
1
,
3
,
−
2
,
2
,
1
,
−
3] entonces
u
ha de ser [
−
1
,
−
2
,
−
3
,
3
,
2
,
1]. El programa ha de escribir en
pantalla el nuevo vector.

## Ejercicio 5 (típico)
 En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra, por ejemplo 56999545W

La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar. Crea un programa que calcule la letra de un DNI a partir del número de DNI que introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo (con la letra).

Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23. El resultado debe estar por tanto entre 0 y 22.

Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior fórmula busque en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:

Posición     0   1   2   3  4   5   6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22

Letra            T   R  W A  G  M  Y  F  P  D  X    B   N    J    Z    S   Q    V   H    L   C   K   E

Por ejemplo, si introducimos el  DNI 20267079, el resto de dividirlo por 23 sería 8, luego la letra sería la P, que es la que ocupa esa posicion  en la matriz de caracteres.

