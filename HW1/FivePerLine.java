public class FivePerLine {
    public static void main(String[] args) {
        int start = 1000;
        int end  = 2000;
        int num = 5;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if ((i + 1) % num == 0) System.out.println();
        }
        System.out.println();
    }
}
