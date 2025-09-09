import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Push ke Stack");
            System.out.println("2. Pop dari Stack");
            System.out.println("3. Tambah ke Queue");
            System.out.println("4. Dequeue dari Queue");
            System.out.println("5. Lihat Stack");
            System.out.println("6. Lihat Queue");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data untuk Stack: ");
                    String dataStack = scanner.nextLine();
                    stack.push(dataStack);
                    System.out.println("Data \"" + dataStack + "\" ditambahkan ke Stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Pop dari Stack: " + stack.pop());
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan data untuk Queue: ");
                    String dataQueue = scanner.nextLine();
                    queue.add(dataQueue);
                    System.out.println("Data \"" + dataQueue + "\" ditambahkan ke Queue.");
                    break;
                case 4:
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeue dari Queue: " + queue.poll());
                    } else {
                        System.out.println("Queue kosong!");
                    }
                    break;
                case 5:
                    System.out.println("Isi Stack: " + stack);
                    break;
                case 6:
                    System.out.println("Isi Queue: " + queue);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}