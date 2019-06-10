import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Division {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/division.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String[] split = st.nextToken().split("x\\^[0-9]+");
            double[] a = new double[split.length];
            for (int j = 0; j < split.length; j++) {
                a[j] = Integer.parseInt(split[j]);
            }

            split = st.nextToken().split("x\\^[0-9]+");
            double[] b = new double[split.length];
            for (int j = 0; j < split.length; j++) {
                b[j] = Integer.parseInt(split[j]);
            }

            System.out.println(check_div(a, b));
        }
    }

    private static boolean check_div(double[] num, double[] den) {
        for (int i = 0; i < num.length - den.length + 1; i++) {
            double mult = (double) num[i] / den[0];

            for (int j = 0; j < den.length; j++) {
                num[i+j] -= den[j] * mult;
            }
        }

//        System.out.println(Arrays.toString(num));

        return Arrays.stream(num).anyMatch(x -> Math.abs(x) > 0.0001);
    }
}
