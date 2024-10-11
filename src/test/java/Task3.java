import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = scanner.nextInt();

        System.out.println("Enter arithmetic Operator:");
        String arithmeticOperator = scanner.next();

        System.out.println("Enter second number:");
        int secondNum = scanner.nextInt();

        scanner.close();

        if(arithmeticOperator.equals("+")){
            System.out.println(firstNum+secondNum);
        }else if(arithmeticOperator.equals("-")){
            System.out.println(firstNum-secondNum);
        } else if (arithmeticOperator.equals("*")) {
            System.out.println(firstNum*secondNum);
        } else if (arithmeticOperator.equals("/")) {
            try {
                int result = firstNum/secondNum;
                System.out.println(result);
            } catch (ArithmeticException  e) {
                System.out.println("Error: Cannot divide by zero.");
            }
        }
    }
}
