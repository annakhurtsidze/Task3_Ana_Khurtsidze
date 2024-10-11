import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a: ");
        float a = scanner.nextFloat();

        System.out.println("Please enter b: ");
        float b = scanner.nextFloat();

        System.out.println("Please enter c: ");
        float c = scanner.nextFloat();

        scanner.close();

        if (a == 0) {
            System.out.println("a shouldn't be zero");
        } else if (b == 0) {
            System.out.println("b shouldn't be zero");
        } else if (c < 0) {
            System.out.println("c should be greater or equal to zero");
        } else {
            float x = (float) (Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c)) / (a * b + c);
            System.out.println("Calculated value is: " + x);
        }
    }
}
