# Pruebas unitarias con Junit


## 1. Tabla de pruebas
| Número de prueba | Datos que recibe | Resultado esperado | Lo que devuelve |
|:---:|:---|:---:|:---|
| 1 | `{}` | `0` | `0` |
| 2 | `{1, 2, 3, 4, 5}` | `0` | `0` |
| 3 | `{0, 2, 3, 4}` | `1` | `0` |
| 4 | `{1, 0, 3, 0, 5}` | `2` | `2` |
| 5 | `null` | `NullPointerException` | `NullPointerException` |
## 2. Descripción de las pruebas

1.  **Arreglo vacío:** se comprueba que, cuando el arreglo no contiene
    elementos, el método devuelva `0`, ya que no hay ceros que contar.
2.  **Arreglo sin ceros:** se utilizan números distintos de cero para
    verificar que el método no cuente elementos que no cumplen con la
    condición.
3.  **Cero en la primera posición:** se revisa si el método toma en
    cuenta un cero ubicado al inicio del arreglo. El resultado esperado
    es `1`, pero el método devuelve `0` porque su ciclo comienza en la
    posición `1`.
4.  **Dos ceros en el arreglo:** se comprueba que el método cuente los
    ceros que aparecen en distintas posiciones. En este caso, devuelve
    `2`, que coincide con el resultado esperado.
5.  **Arreglo nulo:** se verifica que el método lance una excepción
    cuando recibe `null`, tal como está indicado en su código.

## 3. Dificultad encontrada

Lo que me presentó más reto fue identificar qué número tenía que
devolver cada prueba. Para resolverlo, tuve que revisar los datos que
recibe el método y contar cuántos ceros había en cada arreglo. También
fue necesario tomar en cuenta que el resultado podía ser diferente al
esperado, dependiendo de cómo está escrito el ciclo dentro del método.

Esto me ayudó a entender que no basta con colocar diferentes arreglos
como datos de prueba; también es importante analizar cada caso y saber
cuál debería ser su resultado para poder compararlo con lo que realmente
devuelve el programa.

## 4. Uso de inteligencia artificial

Utilicé inteligencia artificial chat Gpt como apoyo para definir el formato de
este archivo Markdown y para identificar qué pruebas podía realizar al
método `numZero()`.