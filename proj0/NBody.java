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

    public static void printBackground(String filename) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-500, 500);
        StdDraw.clear();
        StdDraw.picture(0, 0, filename);
        StdDraw.show();
        StdDraw.pause(2000);
    }

    public static void main(String [] args) {
        double t = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        printBackground(filename);
    }
}