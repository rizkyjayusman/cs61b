public class NBody {
    public static double readRadius(String filename) {
        In in = new In(filename);
        int arrLength = in.readInt();
        double radius = in.readDouble();
        return radius;
    }
}