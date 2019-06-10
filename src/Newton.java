import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Newton {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/newton.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());

            if (p == 0 && q == 0 && r == 0 && s == 0 && t == 0 && u == 0) {
                System.out.println("0.0000");
                continue;
            }

            Set<String> output = new HashSet<>();
            double last = 0;
            for (double x = 0; x < 1; x += 0.00001){
                double val = eval(p, q, r, s, t, u, x);
                if ((last < 0 && val > 0) || (last > 0 && val < 0) || val == 0) {
                    output.add(String.format("%.4f", x));
                }
                last = val;
            }

            if (output.isEmpty())
                System.out.print("No solution");
            else {
                output.stream().sorted().forEach(x -> System.out.print(x + " "));
            }

            System.out.println();

        }
    }

    private static double eval(double p, double q, double r, double s, double t, double u, double x) {
        return
                p * Math.pow(Math.E, -x) +
                        q * Math.sin(x) +
                        r * Math.cos(x) +
                        s * Math.tan(x) +
                        t * x * x +
                        u;

    }
}
