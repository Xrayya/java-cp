import java.util.Scanner;

public class Team {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = in.nextInt();

        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += in.nextInt();
            }
            if (sum > 1) {
                res++;
            }
        }

        System.out.println(res);
    }
}
