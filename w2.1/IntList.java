public class IntList {
    public int first;
    public IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public int size() {
        if(rest == null) {
            return 1;
        }

        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        IntList i = this;
        int total = 0;
        while(i != null) {
            total++;
            i = i.rest;
        }

        return total;
    }

    public void print() {
        IntList i = this;
        while(i != null) {
            System.out.println(i.first);
            i = i.rest;
        }
    }

    public int get(int i) {
        if(i == 0) {
            return this.first;
        }

        return this.rest.get(i - 1);
    }

    public int iterativeGet(int x) {
        IntList i = this;
        while(x > 0) {
            i = i.rest;
            x = x - 1;
        }

        return i.first;
    }

    public static void main(String [] args) {
        IntList list = new IntList(5, null);
        list = new IntList(10, list);
        list = new IntList(15, list);

        list.print();
        System.out.println(list.size());
        System.out.println(list.iterativeSize());

        System.out.println(list.get(2));
        System.out.println(list.iterativeGet(1));
    }
}