import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sigfigs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/sigfigs.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.startsWith("-")) {
                line = line.substring(1);
            }

            if (line.contains(".")) {
                String[] split = line.split("[.]");

                String pre = split[0];
                String post = split[1];

                if (Double.parseDouble(line) == 0.0) {
                    System.out.println(post.length());
                    continue;
                }

                pre = pre.replaceFirst("^0+", "");

                int sig = pre.length();

                if (sig == 0) {
                    post = post.replaceFirst("^0+", "");
                    int figs = post.length();
                    System.out.println(figs);
                } else {
                    int figs = post.length();
                    System.out.println(sig + figs);
                }

            } else {
                line = line.replaceFirst("^[0.]+", "");
                line = line.replaceFirst("[0.]+$", "");
                int sigfigs = line.length();

                System.out.println(sigfigs);
            }
        }
    }
}
