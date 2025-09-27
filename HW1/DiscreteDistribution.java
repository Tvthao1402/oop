public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int[] weights = new int[n];
        for (int i = 0 ; i < n ; i++) {
            weights[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        for(int i = 0; i < n ; i++) {
            sum += weights[i];
        }
        int r = (int) (sum * Math.random());
        int tong = 0;
        for (int i = 0 ; i < n ; i++) {
            tong += weights[i];
            if(tong > r) {
                System.out.println(i);
                return;
            }
        }
    }
}
