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
        IntList ref = null;
        if(L.rest != null) {
            ref = dincrList(L.rest, x);
        }

        return new IntList(L.first - x, ref);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println("L size before copy to N => " + L.size());
        System.out.println("L size before copy to N using iterative => " + L.iterativeSize());
        System.out.println("L before copy to N");
        L.print();

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(incrList(L, 3));
        IntList N = incrList(L, 3);
        System.out.println("L size after copy to N => " + L.size());
        System.out.println("L size after copy copy to N using iterative => " + L.iterativeSize());
        System.out.println("L does not changed");
        L.print();

        System.out.println("N size => " + N.size());
        System.out.println("N size using iterative => " + N.iterativeSize());
        System.out.println("N identical to L but L does not changed");
        N.print();

        IntList M = dincrList(L, 3);
        System.out.println("L size after copy to M => " + L.size());
        System.out.println("L size after copy to M using iterative => " + L.iterativeSize());
        System.out.println("L does not changed");
        L.print();

        System.out.println("M size => " + M.size());
        System.out.println("M size using iterative => " + M.iterativeSize());
        System.out.println("M identical to L but L does not changed");
        M.print();

    }
}