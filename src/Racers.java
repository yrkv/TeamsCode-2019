import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Racers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/racers.txt"));

        int N = Integer.parseInt(br.readLine());


        String[][] lines = new String[N][];
        for (int i = 0; i < N; i++) {
            lines[i] = br.readLine().split(" ");
        }

        Arrays.sort(lines, Comparator.comparingDouble(a -> Double.parseDouble(a[1])));

        for (String[] pair : lines) {
            System.out.printf("%s ", pair[0]);
        }
    }
}
