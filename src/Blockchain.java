public class Blockchain {
    Node head;
    Node tail;

    public void insert(String hash) {

        Node block = new Node(hash);
        if (head == null) {
            head = block;
            tail = block;

        } else {
            tail.next = block;
            block.previous = tail;
            tail = block;

        }
    }

    public void PrintBlockChain() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

}
