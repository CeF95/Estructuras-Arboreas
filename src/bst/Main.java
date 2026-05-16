package bst;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el árbol binario de búsqueda
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("=== 1. DEMOSTRACIÓN DE INSERCIÓN EN TIEMPO REAL ===");
        System.out.println("Insertando valores: 50, 30, 70, 20, 40");
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.println("\n=== 2. IMPRESIÓN DE RECORRIDOS REQUERIDOS ===");
        System.out.print("Recorrido In-Order (Orden Ascendente): ");
        bst.inOrder();

        System.out.print("Recorrido Pre-Order: ");
        bst.preOrder();

        System.out.print("Recorrido Post-Order: ");
        bst.postOrder();

        System.out.println("\n=== 3. PRUEBA DE BÚSQUEDA (Sustentación Big-O) ===");
        System.out.println("¿El valor 40 existe en el árbol?: " + bst.search(40));
        System.out.println("¿El valor 99 existe en el árbol?: " + bst.search(99));

        System.out.println("\n=== 4. DEMOSTRACIÓN DE ELIMINACIÓN ===");
        System.out.println("Eliminando el nodo 30 (Este nodo cuenta con DOS hijos)");
        bst.delete(30);
        
        System.out.print("Nuevo recorrido In-Order tras la eliminación: ");
        bst.inOrder();
    }
}
