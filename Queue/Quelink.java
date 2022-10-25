import java.util.Scanner;

public class Quelink {

    class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }

    }

    private node head = null;
   

    void enqueue(int d) {
        node newnode = new node(d);
        node ptr = head;
        if (head == null) {
            head = newnode;
            return;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;

    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty!!");
            return;
        }
        head = head.next;
    }

    void display() {
        node ptr = head;
        if (head == null) {
            System.out.println("Queue is empty!!");
            return;
        }
        while (ptr != null) {
            System.out.print(ptr.data + "<--");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        Quelink lst = new Quelink();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.println("Enter your choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the data to be added:");
                    int d = in.nextInt();
                    lst.enqueue(d);
                    break;
                case 2:
                    lst.dequeue();
                    break;
                case 3:
                    lst.display();
                    break;
                case 4:
                    p = 0;
                    break;
                default:
                    System.out.println("invalid");
            }
        }

    }
}
