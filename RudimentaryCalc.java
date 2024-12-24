import java.util.Scanner;

public class RudimentaryCalc {
    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter an equation (e.g., 5+3 or 234214-23): ");
            String equation = myObj.nextLine();

            // Find the operator and split the equation accordingly
            String operator = "";
            int operatorIndex = -1;

            if (equation.contains("+")) {
                operator = "+";
                operatorIndex = equation.indexOf("+");
            } else if (equation.contains("-")) {
                operator = "-";
                operatorIndex = equation.indexOf("-");
            } else if (equation.contains("*")) {
                operator = "*";
                operatorIndex = equation.indexOf("*");
            } else if (equation.contains("/")) {
                operator = "/";
                operatorIndex = equation.indexOf("/");
            }

            if (operatorIndex == -1) {
                System.out.println("Invalid equation! Please try again.");
                continue; // Rerun the program
            }

            try {
                double number1 = Double.parseDouble(equation.substring(0, operatorIndex));
                double number2 = Double.parseDouble(equation.substring(operatorIndex + 1));

                switch (operator) {
                    case "+":
                        System.out.println("Result: " + add(number1, number2));
                        break;
                    case "-":
                        System.out.println("Result: " + subtract(number1, number2));
                        break;
                    case "*":
                        System.out.println("Result: " + multiply(number1, number2));
                        break;
                    case "/":
                        System.out.println("Result: " + divide(number1, number2));
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        break;
                }

                myObj.close();
                break; // Exit the loop if the equation is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid equation! Please try again.");
            }
        }
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }
}
