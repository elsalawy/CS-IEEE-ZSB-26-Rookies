import java.util.Scanner;
public class Apples {

    static int n;
    static long[] apples;
    static long best = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        apples = new long[n];
        long total = 0;

        for (int i = 0; i < n; i++) {
            apples[i] = sc.nextLong();
            total += apples[i];
        }

        solve(0, 0, total);

        System.out.println(best);
    }

    public static void solve(int idx, long sum, long total)
    {
        if (idx == n)
        {
            long diff = Math.abs(total - 2 * sum);
            if (diff < best)
            {
                best = diff;
            }
            return;
        }
        solve(idx + 1, sum + apples[idx], total);
        solve(idx + 1, sum, total);
    }
}
