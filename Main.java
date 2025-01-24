import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        inputThenPrintSumAndAvarege();
    }

    public static void inputThenPrintSumAndAvarege() {
        boolean isInt = true;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;

        while (isInt) {
            try {
                System.out.println("Digite um número inteiro: ");
                int num = scanner.nextInt();
                count += 1;
                sum += num;
                avg = sum / count;
            } catch (java.util.InputMismatchException err) {
                scanner.close();
                System.out.println("SUM: " + sum + " " + "AVG: " + avg);
            }
        }
    }
}