class Node {
    private int value;
    private Node next;

    // Constroctor
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // Set next node
    public void setNext(Node next) {
        this.next = next;
    }

    // Get next node
    public Node getNext() {
        return this.next;
    }

    // Get value
    public int getValue() {
        return this.value;
    }
}

public class Queue {
    private Node front; // elemen depan
    private Node rear; // elemen belakang

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        System.out.println("Enqueue: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue!");
            return 0;
        }

        int value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeue: " + value);
        return value;
    }

    public void swapFrount() {
        if (front == null || front.getNext() == null) {
            System.out.println("Queue kurang dari 2 elemen, tidak bisa di swap!");
            return;
        }

        Node second = front.getNext();
        front.setNext(second.getNext());
        second.setNext(front);
        front = second;

        if (rear == second) { // update rear jika perlu
            rear = second.getNext();
        }

        System.out.println("Swap dua elemen");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        Node current = front;
        System.out.print("Isi queue: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.dequeue(); // coba dequeue saat kosong
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        queue.swapFrount(); // tukar dua elemen depan
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.swapFrount(); // cek swap saat elemen kurang dari 2
    }
}