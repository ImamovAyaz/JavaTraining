import java.util.Scanner;

public class CyclesAndArrays {
    public static void main(String[] args) {
        //cycle "while"
        System.out.println("Если хотите выйти из цикла, напишите 'Exit'");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            if (input.equals("Exit")) {
                break;
            }
        }

        //cycle "for"
        System.out.println("Введите число:");
        Scanner scanner1 = new Scanner(System.in);
        int negativeNumber = scanner.nextInt();
        int sum = 0;
        if (negativeNumber >= 0) {
            for (int i = 0; i < negativeNumber; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d", negativeNumber, sum);
        }
        System.out.println("Exception: Negative Number");

        //cycle "for"
        System.out.println("Введите число:");
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner2.nextInt();
        if ((number > 0) && (number <=100))
        {
            System.out.println("Отлично, нам это подходит!");
        }
        else
        {
            while ((number <0) || (number >100))
            {
                System.out.println("Введено некорректное число. Ожидается число от 0 до 100");
                System.out.println("Введите число повторно:");
                Scanner newScanner = new Scanner(System.in);
                number = scanner2.nextInt();
            }
            System.out.println("Отлично, нам это подходит!");
        }
        //array
        String[] channels = {"Первый канал", "Второй канал", "Третьий канал", "Четвертый канал", "Пятый канал", "Шестой канал", "Седьмой канал", "Восьмой канал", "Девятый канал", "Десятый канал"};
        System.out.println("Введите номер канал:");
        Scanner scannerChannel = new Scanner(System.in);
        int channelNumber = scannerChannel.nextInt();
        while ((channelNumber != 0)) {
            switch (channelNumber) {
                case 1:
                    System.out.println(channels[0]);
                    break;
                case 2:
                    System.out.println(channels[1]);
                    break;
                case 3:
                    System.out.println(channels[2]);
                    break;
                case 4:
                    System.out.println(channels[3]);
                    break;
                case 5:
                    System.out.println(channels[4]);
                    break;
                case 6:
                    System.out.println(channels[5]);
                    break;
                case 7:
                    System.out.println(channels[6]);
                    break;
                case 8:
                    System.out.println(channels[7]);
                    break;
                case 9:
                    System.out.println(channels[8]);
                    break;
                case 10:
                    System.out.println(channels[9]);
                    break;
                default:
                    System.out.println("Такой канал не существует, введите другой");
                    break;
            }
            scannerChannel = new Scanner(System.in);
            channelNumber = scannerChannel.nextInt();
        }
        System.out.println("Телевизор выключен");
    }
}

