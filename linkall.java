class linkall {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static void deletenth(int val) {
        if (head == null)
            return;
        if (head.data == val) {
            head = head.next;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return;
    }

    public static Node insertAtposition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node p = head;
        for (int i = 1; i < pos - 1 && p != null; i++) {
            p = p.next;
        }
        if (p == null) {
            System.out.println("position");
            return head;
        }
        newNode.next = p.next;
        p.next = newNode;
        return head;

    }

    public static void insertionAtEnd(int val) {
        Node newnNode = new Node(val);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnNode;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            insertAtBeginning(i);
        }
        System.out.println("Insert At beginning");
        insertAtBeginning(90);
        printList();
        System.out.println();
        System.out.println("insert at end");
        insertionAtEnd(100);
        printList();

        System.out.println();
        System.out.println("insert at specific position");
        insertAtposition(100, 8);
        printList();

    }
}