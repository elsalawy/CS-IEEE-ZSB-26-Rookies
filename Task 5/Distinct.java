import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        while (t-- > 0) {
            int n = s.nextInt();

            int a = 0, b = 0, c = 0;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    break;
                }
            }

            if (a == 0) { 
                System.out.println("NO");
                continue;
            }

            int n1 = n / a;

            for (int i = a + 1; i * i <= n1; i++) {
                if (n1 % i == 0) {
                    b = i;
                    break;
                }
            }

            if (b == 0) { 
                System.out.println("NO");
                continue;
            }

            c = n / (a * b);

            if (c > 1 && c != a && c != b) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("NO");
            }
        }
    }
}
