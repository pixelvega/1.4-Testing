# Nivel 1: JUnit

## Ejercicio 1

**Crea una clase Java que gestione una colección de libros en una biblioteca**. La clase debe permitir:

- **Añadir libros**
- **Recuperar la lista de libros**
- **Obtener un libro específico por su posición**
- **Añadir un libro en una posición específica**
- **Eliminar un libro por título**

### Implementa las siguientes funcionalidades:

- La clase debe **permitir añadir libros a la colección**.
- Se debe poder **recuperar la lista completa de libros**.
- Se debe poder **obtener el título de un libro dada una posición**.
- Se debe poder **añadir un libro en una posición específica**.
- Se debe poder **eliminar un libro por título**.

### Verifica su correcto funcionamiento con **JUnit**:

- Verifican que la **lista de libros no es nula** después de crear un objeto nuevo.
- Confirman que la lista tiene un **tamaño esperado después de insertar varios libros**.
- Aseguran que la lista **contiene un libro específico en su correcta posición**.
- Verifican que **no existen títulos de libros duplicados** en la lista.
- Comprueban que se puede **recuperar el título de un libro dada una posición específica**.
- Aseguran que **añadir un libro modifica correctamente la lista**.
- Confirman que **eliminar un libro disminuye el tamaño de la lista**.
- Verifican que la **lista permanece ordenada alfabéticamente** después de añadir o eliminar un libro.

---

## Ejercicio 2
Crea una clase llamada **CalculoDni** que **calcule la letra del DNI** al recibir el **número como parámetro**.

Crea una clase **JUnit** que verifique su **correcto funcionamiento**, **parametrizándola** para que el test reciba un **espectro de datos amplio** y valide si el cálculo es correcto para **10 números de DNI predefinidos**.

  ---

## Ejercicio 3
Crea una clase con un método que arroje una **ArrayIndexOutOfBoundsException**.

Verifica su **correcto funcionamiento** con un **test JUnit**.

---


# Nivel 2: AssertJ
Crea las clases Java y/o tests que las prueban para demostrar lo siguiente:

## Ejercicio 1
Una aserción que demuestre que el valor de dos objetos enteros es igual, y otra que indique que no lo es.

---

## Ejercicio 2

Una aserción que demuestre que la referencia a un objeto es la misma que otra, y otra que indique que es distinta.

---

## Ejercicio 3

Una aserción que indique que dos arrays de enteros son idénticos.

---

## Ejercicio 4
- Crea un <CODE>arrayList</CODE> contenedor de varios tipos de objetos (créalos también).
- Escribe una <CODE><i>asertion</i></CODE> para **verificar el orden de los objetos en ArrayList según han sido insertados**.
- **Verifica** ahora que la lista anterior **contiene los objetos en cualquier orden**.
- Verifica que en la lista anterior **uno de los objetos se ha añadido sólo una vez**.
- Deja **uno de los elementos sin añadir**, y **verifica** que **la lista no contiene éste último**.

---

## Ejercicio 5
Crea un mapa y verifica que contiene una de las key que le añade.

---

## Ejercicio 6
- Provoca una <CODE>ArrayIndexOutOfBoundsException</CODE> en una clase cualquiera.
- Crea una <CODE>aserción</CODE> que **valide que la excepción es arrojada cuando corresponde**.

---

## Ejercicio 7
- Crea un objeto <CODE>Optional</CODE> vacío.
- Escribe la **aserción** correcta para **verificar que efectivamente está vacío**.

---

# Nivel 3: TDD

## Ejercicio 1:
Supongamos que queremos crear una clase llamada <CODE>Calculadora</CODE> que tenga métodos para realizar operaciones básicas como **suma, resta, multiplicación y división**.

Vamos a escribir pruebas **antes de implementar la funcionalidad**:

1. Crea una clase de prueba llamada Calculadora Test.
2. Escribe las pruebas para verificar los métodos sumar, restar, dividir y multiplicar de la calculadora.
3. Ejecuta las pruebas. Deberían fallar, puesto que todavía no hemos implementado los métodos en la clase Calculadora.
4. Crea una clase Calculadora que contenga los métodos especificados por las pruebas.
5. Ejecuta las pruebas.
6. Itera sobre el proceso:
    - Después de cada iteración, continúa el proceso de TDD
    - reescribe las pruebas
    - refactoriza el código si es necesario
    - repite el ciclo de desarrollo para mejorar y ampliar la funcionalidad de la clase calculadora.