import java.util.Scanner;
public class Dreamoon {
    
    static int targetPosition;
    static char[] dreamoonCommands;
    static int commandCount;
    static int correctCount;
    static int totalCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalCommands = scanner.next();
        String receivedCommands = scanner.next();

        commandCount = originalCommands.length();
        dreamoonCommands = receivedCommands.toCharArray();

        targetPosition = 0;
        for (char command : originalCommands.toCharArray()) {
            if (command == '+') targetPosition++;
            else targetPosition--;
        }

        explore(0, 0);

        double probability = (double) correctCount / totalCount;
        System.out.printf("%.12f\n", probability);
    }

    public static void explore(int commandIndex, int currentPosition) {
        if (commandIndex == commandCount) {
            totalCount++;
            if (currentPosition == targetPosition) correctCount++;
            return;
        }

        if (dreamoonCommands[commandIndex] == '+') {
            explore(commandIndex + 1, currentPosition + 1);
        } else if (dreamoonCommands[commandIndex] == '-') {
            explore(commandIndex + 1, currentPosition - 1);
        } else {
            explore(commandIndex + 1, currentPosition + 1);
            explore(commandIndex + 1, currentPosition - 1);
        }
    }
}
