public class Birthday {
    public static void main(String[] args) {
        int days = 365;
        int total_people = 0;
        boolean[] hasBirthday = new boolean[days];
        while (true) {
            total_people++;
            int d = (int) (days * Math.random());
            if (hasBirthday[d]) break;
            hasBirthday[d] = true;
        }
        System.out.println(total_people);
    }
}
