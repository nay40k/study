public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "=========================================================================================");
        System.out.println("========================== Домашнее задание #4 30.02 Циклы ==============================");
        System.out.println("=========================================================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "#4.1 Создайте программу, вычисляющую факториал натурального числа n" + ANSI_RESET);
        int input = 5;
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = i * factorial;
        }
        System.out.println(input + "! = " + factorial);
        System.out.println();

        System.out.println(ANSI_GREEN + "#4.2 Найдите сумму и произведение цифр числа, введенного с клавиатуры" + ANSI_RESET);
        int number = (int) (Math.random() * 1000); //рандом вместо ручного ввода
        System.out.println("Число: " + number);
        int sum = 0;
        int mult = 1;
        while (number > 0) {
            sum += number % 10;
            mult *= number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum + "\nПроизведение цифр числа: " + mult);


        System.out.println(ANSI_GREEN + "#4.3 Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс" + ANSI_RESET);
        number = (int) (Math.random() * 999999); //рандом вместо ручного ввода
        System.out.printf("%30s", "Введённое число: "); //форматированный вывод чтобы в консоли числа были друг над другом
        System.out.println(number);
        int max = 0;
        int index = 0;
        for (int i = 0; number > 0; i++) {
            if ((number % 10) > max) {
                max = (number % 10);
                index = i;
            }
            number /= 10;
        }
        System.out.printf("%30s", "Самая большая цифра числа: ");
        System.out.println(max);
        System.out.printf("%30s", "Индекс цифры (справа налево): ");
        System.out.println(index);
        System.out.println();

        System.out.println(ANSI_GREEN + "#4.4 Задача про суеверия армий Японии и Германии" + ANSI_RESET);
        int counter = 0;
        for (int i = 1; i <= 99999; i++) {
            for (int j = 1; j <= 1000; j *= 10) {
                if (i / j % 10 == 4 || (i / j % 100 == 13)) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Придется исключить " + counter + " номеров из 99999");
        System.out.println();

        System.out.println(ANSI_GREEN + "#4.5 Задача про счастливые билетики" + ANSI_RESET);
        int luckyTicketCounter = 0;
        for (int i = 1001; i <= 999999; i++) {
            if (i % 1000 == i / 1000) {
                luckyTicketCounter += 1;
            } else {
                int firstHalfSum = 0;
                int secondHalfSum = 0;
                int firstHalf = (i / 1000);
                int secondHalf = i % 1000;
                while (firstHalf > 0) {
                    firstHalfSum += firstHalf % 10;
                    firstHalf /= 10;
                }
                while (secondHalf > 0) {
                    secondHalfSum += secondHalf % 10;
                    secondHalf /= 10;
                }
                if (firstHalfSum == secondHalfSum) {
                    luckyTicketCounter += 1;
                }
            }


        }
        System.out.println("Счастливых билетиков в рулоне " + luckyTicketCounter);
        System.out.println();

        System.out.println(ANSI_GREEN + "#4.6 Задача про таблички для склада и непутёвую типографию" + ANSI_RESET);
        int tagCounter = 0;
        for (int i = 1; i <= 50000; i++) {
            for (int j = 1; j <= 10000; j *= 10) {
                if (i / j % 10 == 2) {
                    tagCounter++;
                    break;
                }
            }
        }
        System.out.println("Придётся перепечатать " + tagCounter + " табличек");
        System.out.println();


        System.out.println(ANSI_GREEN + "#4.7 Для введенного целого числа определить является ли это число простым" + ANSI_RESET);
        int num = (int) (Math.random() * 99 + 1);
        System.out.println("Сгенерированное целое число: " + num);
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
        System.out.println();


        System.out.println(ANSI_GREEN + "#4.8 Задача про зеркальное время на электронных часах" + ANSI_RESET);
        int matchCounter = 0;
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hours / 10 % 10 == minutes % 10 && hours % 10 == minutes / 10 % 10) {
                    matchCounter++;
                }
            }
        }
        System.out.println("Всего " + matchCounter + " совпадений");
    }
}