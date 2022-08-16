import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int count = 0;
        int advancer = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input > 0) {
                advancer++;
            }
            count++;

            if (count == k) {
                for (int j = i + 1; j < n; j++) {
                    int input2 = in.nextInt();
                    if (input2 == input && input2 > 0) {
                        advancer++;
                    } else {
                        break;
                    }
                }
                in.close();
                break;
            }
        }

        System.out.println(advancer);
    }
}
