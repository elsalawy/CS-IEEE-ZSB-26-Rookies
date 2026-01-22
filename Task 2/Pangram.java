import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt(); // no. of charcter
        s.nextLine();
        String str = s.nextLine();
        str = str.toLowerCase();
        boolean letters[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') // ASCII Code for a =97 and z =122
            {
                letters[c - 'a'] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) 
        {
            if (letters[i]) 
            {
                count++;
            }
        }
        if (count == 26)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
