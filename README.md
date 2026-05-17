# Estructuras-Arboreas

Una estructura arbórea es una estructura de datos no lineal y dinámica que se utiliza para representar elementos organizados de forma jerárquica. En un árbol los datos se ramifican, conectándose en relaciones de tipo padre e hijo.

## BinarySearchTree

Es un árbol binario donde cada nodo tiene como máximo dos hijos. Cumple con la propiedad fundamental: para cualquier nodo, los valores de su subárbol izquierdo son menores y los de su subárbol derecho son mayores.

### Caracteristicas

Propiedad de Orden Estricta: Clasificación automática donde los valores menores al nodo actual se desplazan al subárbol izquierdo y los mayores al derecho.

Eliminación Avanzada: Lógica capaz de resolver de forma dinámica los 3 escenarios críticos de borrado de nodos (hojas, un hijo o dos hijos).

Múltiples Recorridos: Implementación de tres algoritmos de exploración sistemática profunda (In-Order, Pre-Order y Post-Order).

Sustentación Algorítmica: Estructura ideal para la medición del rendimiento temporal en búsquedas bajo la notación Big-O.

### Tecnologias utilizadas

Lenguaje: Java 26.0.1

Paradigma: Programación Orientada a Objetos (POO)

### Estructura del Codigo
```text
src/
└── bst/
    ├── Node.java
    ├── BinarySearchTree.java
    └── Main.java

### Ejemplo y uso

Al ejecutar la clase Main.java, la terminal desplegará de forma automática las fases del ciclo de vida del árbol bajo el siguiente esquema interactivo:

Inserción: Confirmación de los valores inyectados en la raíz y subárboles secundarios.

Muestra Dinámica: Despliegue de los recorridos donde se verifica que el método inOrder() expone los datos ordenados ascendentemente de forma nativa.

Búsqueda Lógica: Impresión de resultados booleanos tras rastrear nodos existentes e inexistentes.

Eliminación Estructural: Reajuste en vivo sustituyendo el nodo intermedio (30) por su sucesor y comprobación final de la persistencia jerárquica del BST.

### Video

[VIDEO EXPLICATIVO](https://drive.google.com/drive/folders/1kmygVZU7ap6jowvaj_2BEnOdvi6Pu3Xf?usp=sharing)