import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Intersect {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/intersect.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] a = st.nextToken().split("x");
            String[] b = st.nextToken().split("x");

            int m1 = Integer.parseInt(a[0]);
            int b1 = Integer.parseInt(a[1]);

            int m2 = Integer.parseInt(b[0]);
            int b2 = Integer.parseInt(b[1]);

            if (m1 != m2) {
                System.out.println(true);
            } else if (b1 == b2) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}
