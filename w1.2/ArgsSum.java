public class ArgsSum {
    public static void main(String [] args) {
        int sum = 0;
        int i = 0;
        while(i < args.length) {
            sum = sum + Integer.parseInt(args[i]);
            i = i + 1;
        }

        System.out.println(sum);
    }
}