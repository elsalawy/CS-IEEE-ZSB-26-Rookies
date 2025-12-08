import java.util.ArrayList;
import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // no of iteration
        s.nextLine();

        while (t-- > 0) {
            int n = s.nextInt(); // no of question 
            s.nextLine();
            String str = s.nextLine(); 

            ArrayList<Character> solved = new ArrayList<>();
            int points = 0;

            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if (solved.contains(c)) 
                {
                        points++;
                }
                else
                {
                    points += 2; 
                    solved.add(c);
                }
            }

            System.out.println(points);
        }
    }
}
