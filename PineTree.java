import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of layers (Count): ");
        int count = scanner.nextInt();

        System.out.print("Enter the size of each layer (Size): ");
        int size = scanner.nextInt();

        generatePineTree(count, size);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    public static void generatePineTree(int count, int size) {
        // Generate the leaves
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size - j; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * j + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Generate the trunk
        for (int i = 0; i < size / 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" |");
        }
    }
}
