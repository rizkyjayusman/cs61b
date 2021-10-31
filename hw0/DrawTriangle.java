public class DrawTriangle {

    public static void main(String [] args) {
        int x = 1;
        while(x <= 5) {
            int y = 0;
            while(y < x) {
                System.out.print("*");
                y++;
            }
            System.out.println("");
            x++;
        }
    }
    
}