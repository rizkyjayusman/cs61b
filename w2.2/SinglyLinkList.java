public class SinglyLinkList {
    
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode sentinel;
    private int size = 0;

    public SinglyLinkList() {
        sentinel = new IntNode(0, null);
    }

    public SinglyLinkList(int x) {
        sentinel = new IntNode(0, null);
        sentinel = new IntNode(x, sentinel);
        size++;
    }

    public void addFirst(int x) {
        sentinel = new IntNode(x, sentinel);
        size++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode n = sentinel;
        while(n.next != null) {
            n = n.next;
        }

        IntNode nw = new IntNode(n.item, n.next);
        n.item = x;
        n.next = nw;
        size++;
    }

    private static void print(IntNode node) {
        if(node.next != null) {
        System.out.println(node.item);
            print(node.next);
        }
    }

    public void print() {
        print(sentinel);
    } 

    public int size() {
        return size;
    }

    public static void main(String [] args) {
        SinglyLinkList sllist = new SinglyLinkList();
        sllist.addFirst(5);
        sllist.addFirst(10);
        sllist.addLast(15);

        sllist.print();
        System.out.println("size => " + sllist.size());
    }

}