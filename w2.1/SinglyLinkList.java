public class SinglyLinkList {
    
    public IntNode first;

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