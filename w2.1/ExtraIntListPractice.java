public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        IntList ref = null;
        if(L.rest != null) {
            ref = incrList(L.rest, x);
        }

        return new IntList(L.first + x, ref);
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(incrList(L, 3));
        IntList N = incrList(L, 3);
        System.out.println(N.size());
        System.out.println(N.iterativeSize());
        N.print();
        System.out.println(dincrList(L, 3));        
    }
}