class Node {
    String data;
    Node previous;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
