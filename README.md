# SegundoParcial - Listas Enlazadas en Java

Este proyecto implementa una lista enlazada simple en Java y permite realizar diversas operaciones sobre ella.

## Cómo ejecutar el código

1.  Asegúrate de tener instalado el JDK (Java Development Kit).
2.  Compila los archivos `.java` usando el siguiente comando en la terminal:

    ```bash
    javac Node.java LinkedList.java MenuLL.java
    ```

3.  Ejecuta el programa principal (MenuLL) con el siguiente comando:

    ```bash
    java MenuLL
    ```

4.  Sigue las instrucciones del menú para interactuar con la lista enlazada.

## Propósito de las clases y métodos

### Clase Node

* **Propósito:** Define la estructura de un nodo en la lista enlazada.
* **Métodos:**
    * `Node(int valor)`: Constructor para crear un nuevo nodo con un valor.

### Clase LinkedList

* **Propósito:** Implementa la lista enlazada y sus operaciones.
* **Métodos:**
    * `LinkedList()`: Constructor para inicializar una lista enlazada vacía.
    * `agregarAlFinal(int valor)`: Agrega un nodo al final de la lista.
    * `agregarAlInicio(int valor)`: Agrega un nodo al inicio de la lista.
    * `agregarEnPosicion(int valor, int posicion)`: Agrega un nodo en una posición específica.
    * `eliminarPorValor(int valor)`: Elimina el primer nodo con el valor dado.
    * `mostrarLista()`: Imprime los valores de los nodos en la lista.
    * `invertirLista()`: Invierte el orden de la lista.
    * `contieneValor(int valor)`: Verifica si un valor existe en la lista.

### Clase MenuLinkedList

* **Propósito:** Proporciona un menú interactivo para usar la lista enlazada.
* **Métodos:**
    * `main(String[] args)`: Punto de entrada del programa. Presenta el menú y maneja la interacción del usuario.

## Ejemplos de entradas y salidas

* **Agregar números y mostrar la lista:**

    * Entrada del usuario:
        * Opción 1 (Agregar al inicio), número: 5
        * Opción 2 (Agregar al final), número: 10
        * Opción 3 (Agregar en posición), número: 15, posición: 1
        * Opción 5 (Mostrar lista)
    * Salida del programa:

        ```
        Lista actual:
        5 -> 15 -> 10 -> null
        ```

* **Eliminar un número:**

    * Entrada del usuario:
        * Opción 4 (Eliminar número), número: 15
        * Opción 5 (Mostrar lista)
    * Salida del programa:

        ```
        Lista actual:
        5 -> 10 -> null
        ```

* **Verificar si un número existe:**

    * Entrada del usuario:
        * Opción 6 (Verificar si existe número), número: 10
    * Salida del programa:

        ```
        El número 10 existe en la lista.
        ```

* **Revertir la lista:**

    * Entrada del usuario:
        * Opción 7 (Revertir lista)
        * Opción 5 (Mostrar lista)
    * Salida del programa:

        ```
        Lista actual:
        10 -> 5 -> null
        ```

## Estructura del código

El código está estructurado en tres clases principales (`Node`, `LinkedList`, `MenuLinkedList`). Cada clase tiene una responsabilidad específica, y los métodos están bien organizados y comentados para mejorar la legibilidad. Se han usado nombres descriptivos y se ha seguido un estilo de codificación consistente.
