public class Stack {
    private Node first;

    public Stack() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(first);
        first = newNode;
        System.out.println("Push: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop!");
            return 0;
        }
        int value = first.getValue();
        first = first.getNext();
        System.out.println("Pop: " + value);
        return value;
    }

    public void swap() {
        if (first == null || first.getNext() == null) {
            System.out.println("Stack kurang dari 2 elemen, tidak bisa di swap!");
            return;
        }
        Node second = first.getNext();
        first.setNext(second.getNext());
        second.setNext(first);
        first = second;

        System.out.println("Swap dua elemen teratas");
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return;
        }

        Node current = first;
        System.out.print("Isi stack: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pop(); // Coba pop saat kosong
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.swap();
        stack.printStack();
    }
}
