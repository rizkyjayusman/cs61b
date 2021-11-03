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

    public static void main(String [] args) {
        SinglyLinkList sllist = new SinglyLinkList(5);
        System.out.println(sllist.getFirst());
        sllist.addFirst(10);
        System.out.println(sllist.getFirst());
    }

}