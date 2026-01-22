import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        double balance = s.nextDouble();
        if(value %5 == 0 && balance>value+0.5)
        {
            balance = balance-value-0.5;
        }
        System.out.printf("%.2f", balance);
}
}
