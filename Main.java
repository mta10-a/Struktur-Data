public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO STACK ===");
        Stack stack = new Stack();

        stack.pop(); // Coba pop saat kosong
        stack.push(30);
        stack.push(50);
        stack.push(60);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.swap();
        stack.printStack();

        System.out.println("\n=== DEMO QUEUE ===");
        Queue queue = new Queue();

        queue.dequeue(); // Coba dequeue saat kosong
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        queue.swapFront(); // Tukar dua elemen depan
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.swapFront(); // Cek swap saat elemen < 2
    }
}
