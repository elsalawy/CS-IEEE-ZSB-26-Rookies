import java.util.Scanner;
public class Division {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repet = sc.nextInt();  // the number of repetition
        while (repet-- > 0) {
            int r = sc.nextInt();   // the number which we want do classifiy
 
            if (r >= 1900) {
                System.out.println("Division 1");
            } else if (r >= 1600) {
                System.out.println("Division 2");
            } else if (r >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
}      
 
}
