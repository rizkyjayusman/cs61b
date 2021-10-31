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

    public static void main(String [] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}