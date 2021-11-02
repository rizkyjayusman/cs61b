public class Walrus {

    public int height;
    public double weight;

    public Walrus(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "Body[x=" + this.height + ", y=" + this.weight + "]";
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

    }
}