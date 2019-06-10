import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contractions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/contractions.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            line = line.replaceAll("�", "'");

            line = line.replaceAll("n't", " not");
            line = line.replaceAll("'ll", " will");
            line = line.replaceAll("'re", " are");
            line = line.replaceAll("'ve", " have");

            System.out.println(line);
        }
    }
}
