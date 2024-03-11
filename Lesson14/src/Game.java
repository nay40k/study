import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public void start() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guessNumber = random.nextInt(100) + 1;


        while (true) {
            int number = 0;
            System.out.print("Введите число:\n");

            try {
                number = scanner.nextInt();

                if (number > 100) {
                    throw new BoundsException("Введите число до 100 включительно");
                } else if (number <= 0) {
                    throw new BoundsException("Введите число больше нуля");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Допустимо вводить только целые числа 1...100");
                scanner.next();
                continue;
            } catch (BoundsException e) {
                System.out.println("Введённое число вне диапазона: " + e.getMessage());
                continue;
            }

            if (number > guessNumber) {
                System.out.println("Загаданное число меньше введённого");
            } else if (number < guessNumber) {
                System.out.println("Загаданное число больше введённого");
            } else {
                System.out.printf("Красавчик, загаданное число %d\n", number);
                break;
            }
        }
    }
}
