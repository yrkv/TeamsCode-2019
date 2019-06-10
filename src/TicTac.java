import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TicTac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/mnt/JudgeFiles/tictactoe.txt"));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            boolean[][] map = new boolean[3][3];
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            String[] c = br.readLine().split(" ");
            br.readLine();

            for (int j = 0; j < 3; j++) {
                map[0][j] = a[j].equals("X");
                map[1][j] = b[j].equals("X");
                map[2][j] = c[j].equals("X");
            }

            int winner = test_tictac(map);
            switch (winner) {
                case 0:
                    System.out.println("Neither");
                    break;
                case 1:
                    System.out.println("X");
                    break;
                case 2:
                    System.out.println("O");
                    break;
            }

        }
    }


    private static int test_tictac(boolean[][] map) {
        // 2 for O
        // 1 for X
        for (int i = 0; i < 3; i++) {
            if (map[i][0] == map[i][1] && map[i][0] == map[i][2]){
                return map[i][0] ? 1 : 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (map[0][i] == map[1][i] && map[0][i] == map[2][i]){
                return map[0][i] ? 1 : 2;
            }
        }

        if (map[0][0] == map[1][1] && map[0][0] == map[2][2])
            return map[0][0] ? 1 : 2;

        if (map[0][2] == map[1][1] && map[0][2] == map[2][0])
            return map[0][2] ? 1 : 2;

        return 0; // neither
    }
}
