import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/cipher.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String left = st.nextToken();
            String right = st.nextToken();
            System.out.println(test(left.toCharArray(), right.toCharArray()) ? "YES" : "NO");
        }
    }

    private static boolean test(char[] left, char[] right) {
        if (left.length != right.length)
            return false;

        Arrays.sort(right);
        Arrays.sort(left);

        if (Arrays.equals(left, right))
            return true;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < left.length; j++) {
                left[j]++;
                if (left[j] > 'Z')
                    left[j] = 'A';
            }

            Arrays.sort(left);

            if (Arrays.equals(left, right))
                return true;
        }

        return false;
    }
}
