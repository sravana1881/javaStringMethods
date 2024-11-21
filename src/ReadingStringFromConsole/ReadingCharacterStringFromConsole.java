package ReadingStringFromConsole;

import java.util.Scanner;

public class ReadingCharacterStringFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = scanner.nextLine();
        char ch = s.charAt(5);
        System.out.println("The character entered is " + ch);

    }
}
