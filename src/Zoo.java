import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Zoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/zoo.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("SampleFiles/zoo.txt"));

        int N = Integer.parseInt(br.readLine());


        HashMap<String, Integer> map = new HashMap<>();
        String[] order = new String[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (!map.containsKey(name))
                order[i] = name;

            map.put(name, map.getOrDefault(name, 0) + n);
        }

        for (String name : order) {
            if (name != null)
                System.out.printf("%d %s ", map.get(name), name);
        }
    }
}
