public class HelloNumbersModified {
    public static void main(String []args) {
        // 0 	0
        // 1 	0 + 1
        // 3 	0 + 1 + 2
        // 6 	0 + 1 + 2 + 3
        // 10	0 + 1 + 2 + 3 + 4
        // ...
        // 65   0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
        int x = 0;
        int result = 0;
        while(x < 10) {
            System.out.println(result);
            x = x + 1;
            result = result + x;
        }
    }
}