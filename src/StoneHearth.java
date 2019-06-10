import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StoneHearth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/stonehearth.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());

            String[] split = br.readLine().split(" ");
            int[] minions = new int[split.length];
            for (int j = 0; j < minions.length; j++) {
                minions[j] = Integer.parseInt(split[j]);
            }

            int total = 0;
            for (int x : minions) {
                total += x;
            }

            Set<Set<Integer>> sets = new HashSet<>();
            sets.add(new HashSet<>());

            for (int j = 0; j < minions.length; j++) {
                int current_minion = minions[j];
                Set<Set<Integer>> add = new HashSet<>();
                for (Set<Integer> set : sets) {
                    Set<Integer> copy = new HashSet<>(set);
                    copy.add(current_minion);
//                    if (set.stream().mapToInt(x -> x).sum() <= m)
                    add.add(copy);
                }
                sets.addAll(add);
            }

            int best = Integer.MAX_VALUE;
            for (Set<Integer> set : sets) {
                int sum = set.stream().mapToInt(x -> x).sum();
                if (sum >= m)
                    best = Math.min(sum, best);
            }

            System.out.println(total - best);
        }
    }
}
