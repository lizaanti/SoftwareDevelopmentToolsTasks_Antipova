import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите два числа: ");

            String inputOne = scanner.nextLine();
            String inputTwo = scanner.nextLine();

            try{
                int numOne = Integer.parseInt(inputOne);
                int numTwo = Integer.parseInt(inputTwo);
                System.out.println("Сумма чисел равна: " + (numOne + numTwo));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
            }
        }
    }
}
