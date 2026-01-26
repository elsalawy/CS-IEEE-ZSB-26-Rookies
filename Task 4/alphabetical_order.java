import java.util.*;
import java.util.ArrayList;
public class alphabetical_order {

    static List<String> results = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];

        generate("", chars, used);

        System.out.println(results.size());
        for (String s : results) {
            System.out.println(s);
        }
    }

    static void generate(String current, char[] chars, boolean[] used) {
        if (current.length() == chars.length) {
            results.add(current);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            generate(current + chars[i], chars, used);
            used[i] = false;
        }
    }
}

