import edu.princeton.cs.algs4.*;
public class RandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;

        int stepSize = 1;
        int direction = 0;

        while (Math.abs(x) < n && Math.abs(y) < n) {
            for (int i = 0; i < stepSize; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);

                if (direction == 0) x++;
                else if (direction == 1) y++;
                else if (direction == 2) x--;
                else if (direction == 3) y--;

                steps++;

                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);

                if (Math.abs(x) >= n || Math.abs(y) >= n) break;
            }

            direction = (direction + 1) % 4;
            if (direction == 0 || direction == 2) stepSize++;
        }
        StdOut.println("Total steps = " + steps);
    }
}
