public class SinglyLinkList {
    
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;
    private int size = 0;

    public SinglyLinkList() {
        first = null;
    }

    public SinglyLinkList(int x) {
        first = new IntNode(x, null);
        size++;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size++;
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x) {
        if(first == null) {
            first = new IntNode(x, null);
            return;
        }

        IntNode n = first;
        while(n.next != null) {
            n = n.next;
        }

        IntNode temp = new IntNode(x, null); 
        n.next = temp;
        size++;
    }

    private static void print(IntNode node) {
        System.out.println(node.item);
        IntNode n = node.next;
        if(n != null) {
            print(n);
        }
    }

    public void print() {
        print(first);
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