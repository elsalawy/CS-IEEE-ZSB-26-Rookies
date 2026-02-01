import java.util.Scanner;

public class  LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long X = s.nextLong();

        long a = 1, b = X; 
        long sqrtX = (long)Math.sqrt(X);

        for(long d = 1; d <= sqrtX; d++) {
            if(X % d == 0) {
                long c = X / d;
           
                if(Math.max(d, c) < Math.max(a, b)) {
                    a = d;
                    b = c;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
