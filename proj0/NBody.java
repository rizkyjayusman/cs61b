public class NBody {
    public static double readRadius(String filename) {
        In in = new In(filename);
        int arrLength = in.readInt();
        double radius = in.readDouble();
        return radius;
    }

    
    public static Body[] readBodies(String filename) {
        In in = new In(filename);
        int arrLength = in.readInt();
        double radius = in.readDouble();
        Body[] arr = new Body[arrLength];
        for(int i = 0; i < arrLength; i++) {
            arr[i] = new Body(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
        }

        return arr;
    }
}