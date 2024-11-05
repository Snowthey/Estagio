import java.util.Scanner;

public class LetterACounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String stringInformada = scanner.nextLine();

        int count = countLetterA(stringInformada);
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int countLetterA(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
