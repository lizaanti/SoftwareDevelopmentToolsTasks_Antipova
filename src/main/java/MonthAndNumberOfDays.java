import java.util.Scanner;

import static java.awt.SystemColor.text;
import static jdk.internal.org.jline.utils.Colors.s;

public class MonthAndNumberOfDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Введите целое число: ");
            String input = scanner.nextLine();

            try{
               int num = Integer.parseInt(input);
                System.out.println(months[num - 1] + "\n" + dom[num - 1]);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Недопустимое число!");
            }
        }
    }
}
