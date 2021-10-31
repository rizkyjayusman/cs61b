public class DrawTriangleB {

    public static void drawTriangle(int n) {
        int x = 1;
        while(x <= n) {
            int y = 0;
            while(y < x) {
                System.out.print("*");
                y++;
            }
            System.out.println("");
            x++;
        }
    }

    public static void main(String [] args) {
        drawTriangle(5);
    }
    
}