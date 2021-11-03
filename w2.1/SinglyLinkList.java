public class SinglyLinkList {
    
    public IntNode first;

    public SinglyLinkList(int x) {
        first = new IntNode(x, null);
    }

    public static void main(String [] args) {
        SinglyLinkList sllist = new SinglyLinkList(5);
        System.out.println(sllist.first.item);
    }

}