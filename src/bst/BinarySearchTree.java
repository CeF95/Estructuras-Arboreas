package bst;

public class BinarySearchTree {
    // Encapsulamiento del nodo raíz
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Encapsulamos la raíz mediante un getter para poder usarla en el Main si fuera necesario
    public Node getRoot() {
        return this.root;
    }
  
    // 1. MÉTODO DE INSERCIÓN
  
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current; 
    }


    // 2. MÉTODO DE BÚSQUEDA

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value 
            ? searchRecursive(current.left, value) 
            : searchRecursive(current.right, value);
    }


    // 3. MÉTODO DE ELIMINACIÓN

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
        } else {
            // Caso 1: El nodo es una hoja (sin hijos)
            if (current.left == null && current.right == null) {
                return null;
            }

            // Caso 2: El nodo tiene un solo hijo
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }

            // Caso 3: El nodo tiene dos hijos
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
        }
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }


    // 4. MÉTODOS DE RECORRIDO

    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }
    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.value + " ");
            inOrderRecursive(node.right);
        }
    }

    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }
    private void preOrderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }
    private void postOrderRecursive(Node node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }
}
