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

    public SinglyLinkList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x) {
        IntNode n = first;
        while(n.next != null) {
            n = n.next;
        }

        IntNode temp = new IntNode(x, null); 
        n.next = temp;
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

    private static int size(IntNode n) {
        if(n.next == null) {
            return 1;
        }

        return 1 + size(n.next);
    } 

    public int size() {
        return size(first);
    }

    public static void main(String [] args) {
        SinglyLinkList sllist = new SinglyLinkList(5);
        sllist.addFirst(10);
        sllist.addLast(15);

        sllist.print();
        System.out.println("size => " + sllist.size());
    }

}