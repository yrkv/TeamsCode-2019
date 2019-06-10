import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Ants {
    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private double dist(Point other) {
            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
        }
    }

    private static class Line {
        Point a, b;

        public Line(Point a, Point b) {
            this.a = a;
            this.b = b;
        }

        public boolean intersect(Line other) {
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/ants.txt"));

        int N = Integer.parseInt(br.readLine());

        Set<Point> ants = new HashSet<>();
//        Set<>
        for (int i = 0; i < N; i++) {

        }
    }
}
