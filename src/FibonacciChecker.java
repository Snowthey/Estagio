import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroInformado = scanner.nextInt();

        if (belongsToFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean belongsToFibonacci(int num) {
        int a = 0, b = 1;
        if (num == a || num == b) return true;

        while (b < num) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b == num;
    }
}
