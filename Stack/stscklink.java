import java.util.*;

public class stscklink {

    class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    node head = null;

    void push(int d) {
        node newnode = new node(d);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void pop() {
        if (head == null) {
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("Popped element is: " + head.data);
        head = head.next;

    }

    void peek() {
        if (head == null) {
            System.out.println("Stack underflow!!");
            return;
        }
        System.out.println("Element at peek is: " + head.data);
    }

    void display() {
        if (head == null) {
            System.out.println("Stack underflow!!");
            return;
        }
        node ptr = head;
        System.out.println("Stack is:");
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String args[]) {
        stscklink sl = new stscklink();
        Scanner in = new Scanner(System.in);
        int ch = 0, p = 100;
        while (p > 0) {
            System.out.println("\n1.push \n 2.pop \n 3.peek \n 4.display \n 5.exit");
            System.out.println("Enter the choice");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    int d = in.nextInt();
                    sl.push(d);
                    break;
                case 2:
                    sl.pop();
                    System.out.println("Item popped.");
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    sl.display();
                    break;
                case 5:
                    p = 0;
                    break;
                default:
                    System.out.println("INVALID");
            }
        }

    }
}
