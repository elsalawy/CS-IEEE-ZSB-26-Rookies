import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int Petya,Vasya,Tonya;
        int count=0;        // the number of question which they are agree to submit its answer
        int n;              // the number of questions

        System.out.println("Enter the number of questions");
        n=s.nextInt();

        for (int i = 0; i < n; i++) {
             Petya = s.nextInt();
             Vasya = s.nextInt();
             Tonya = s.nextInt();  

             if (Petya + Vasya + Tonya >= 2) {
                count++;
            }
        }
         System.out.println(count);
    }
}
