public class IntList {
    public int first;
    public IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public static void main(String [] args) {
        IntList list = new IntList(5, null);
        list = new IntList(10, list);
        list = new IntList(15, list);

        System.out.println(list.first);
        System.out.println(list.rest.first);
        System.out.println(list.rest.rest.first);
    }
}