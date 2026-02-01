import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<Integer, Integer> memo = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int x = s.nextInt();
            if (memo.containsKey(x)) {
                System.out.println(memo.get(x));
                continue;
            }

            int num = x;
            int count = 1;
            for (int i = 2; i * i <= num; i++) {
                int exp = 0;
                while (num % i == 0) {
                    num /= i;
                    exp++;
                }
                count *= (exp + 1);
            }
            if (num > 1) count *= 2;

            memo.put(x, count);
            System.out.println(count);
        }
    }
}