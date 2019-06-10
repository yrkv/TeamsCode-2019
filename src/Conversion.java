import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/conversion.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            int val = (int) Math.floor((double) x * 1000 / 3600);

            System.out.println(val);
        }
    }
}
