public class FindMax {

    public static int max(int[] m) {
        int max = 0;
        int x = 0;
        while(x < m.length) {
            if(max < m[x]) {
                max = m[x];
            }

            x++;
        }

        return max;
    }

    public static int maxWithFor(int [] m) {
        int max = 0;
        for(int x = 0; x < m.length; x++) {
            if(max < m[x]) {
                max = m[x];
            }
        }

        return max;
    }

    public static void main(String [] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        // System.out.println(max(numbers));
        System.out.println(maxWithFor(numbers));
    }
}