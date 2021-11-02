public class Walrus {

    public int weight;
    public double tuskSize;

    public Walrus(int weight, double tuskSize) {
        this.weight = weight;
        this.tuskSize = tuskSize;
    }

    public String toString() {
        return "Body[x=" + this.weight + ", y=" + this.tuskSize + "]";
    }

    public static void main(String [] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5;

        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y;
        y = x;
        x = 2;

        System.out.println(x);
        System.out.println(y);

        String i = "Hi";
        String k;
        k = i;
        i = "Hello";

        System.out.println(i);
        System.out.println(k);

    }
}