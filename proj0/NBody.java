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

    public static void printBackground(String filename, double radius) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-radius, radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, filename);
        StdDraw.show();
        StdDraw.pause(10);
    }

    public static void main(String [] args) {
        double t = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];

        double radius = readRadius(filename);
    
        Body[] bodies = readBodies(filename);
        for(int i = 0; i <= t; i++) {
            printBackground("./images/starfield.jpg", radius);
            for(int j = 0; j < bodies.length; j++) {
                double xForces = bodies[j].calcNetForceExertedByX(bodies);
                double yForces = bodies[j].calcNetForceExertedByY(bodies);
                bodies[j].update(dt, xForces, yForces);
                bodies[j].draw();
            }
        }
    
        StdOut.printf("%d\n", bodies.length);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < bodies.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                        bodies[i].xxPos, bodies[i].yyPos, bodies[i].xxVel,
                        bodies[i].yyVel, bodies[i].mass, bodies[i].imgFileName);   
        }
    }
}