// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + "  ");

        }
        // Task 2
        System.out.println("  ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "  ");
        }
        System.out.println("  ");
        // Task 3
        for (int b = 0; b < 17; b = b + 2) {
            System.out.print(b + "  ");
        }
        // Task 4
        System.out.println("  ");
        for (int c = 10; c >= -10; c--) {
            System.out.print(c + "  ");
        }
        // Task 5
        System.out.println("  ");
        for (int d = 1904; d < 2096; d = d + 4) {
            System.out.print(d + "  ");
        }
        // Task 6
        System.out.println("  ");
        for (int j = 7; j < 100; j = j + 7) {
            System.out.print(j + "  ");
        }
        // Task 7
        System.out.println("  ");
        for (int k = 1; k < 515; k = k * 2) {
            System.out.print(k + "  ");
        }
        // Task 8
        System.out.println("  ");
        int sum = 29000;
        for (int month = 1; month <= 12; month++, sum = sum + 29000) {

            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum);
        }
        // Task 9
        System.out.println("  ");
        double deposit = 29000;

        for (int month1 = 1; month1 <= 12; month1++, deposit = deposit + deposit * 0.01 + 29000) {
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + deposit);
        }
        // Task 10
        System.out.println("  ");
        int mult = 1;
        for (int l = 1; l <= 10; l++, mult = l * 2) {
            System.out.println("2 * " + l + " = " + mult);
        }
    }
}






