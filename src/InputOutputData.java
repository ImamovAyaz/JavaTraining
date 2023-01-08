import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputOutputData {
    public static void main(String[] args) {
        System.out.println("Введите первую строку, пожалуйста:");
        Scanner scanner1 = new Scanner(System.in);
        String inputLine1 = scanner1.nextLine();
        System.out.println("Введите вторую строку, пожалуйста:");
        Scanner scanner2 = new Scanner(System.in);
        String inputLine2 = scanner1.nextLine();
        System.out.println("Все заглавные буквы первой строки: " + inputLine1.toUpperCase());
        System.out.println("_________________________________________________________________");
        System.out.println("Все прописные буквы первой строки: " + inputLine1.toLowerCase());
        System.out.println("_________________________________________________________________");
        System.out.println("Длина первой строки: " + inputLine1.length() + "символов");
        System.out.println("_________________________________________________________________");
        System.out.println("Первая строка в виде байтов: " + inputLine1.getBytes());
        System.out.println("_________________________________________________________________");
        System.out.println("Сравним первую и вторую строки вне зависимости от их регистра: ");
        if (inputLine1.equalsIgnoreCase(inputLine2)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки различаются");
        }
        System.out.println("_________________________________________________________________");
        System.out.println("Сравним первую и вторую строки: ");
        if (inputLine1.equals(inputLine2)) {
            System.out.println("Строки совпадают");
        } else {
            System.out.println("Строки различаются");
        }
        System.out.println("_________________________________________________________________");
        System.out.println("Если у вас возник вопрос, пустая ли первая строка, то я вам отвечу: ");
        if (inputLine1.isEmpty()) {
            System.out.println("ДА");
        } else {
            System.out.println("Конечно же нет!");
        }
        System.out.println("_________________________________________________________________");
        System.out.println("Вот что получится если соединить две строки: " + inputLine1.concat(inputLine2));
        System.out.println("_________________________________________________________________");
        System.out.println("Каноническое представление первой строки: " + inputLine1.intern());
        System.out.println("_________________________________________________________________");
        System.out.println("Заменим второй символ первой строки на третий символ: " + inputLine1.replace(inputLine1.substring(1, 2), inputLine1.substring(2, 3)));
        System.out.println("_________________________________________________________________");
        System.out.println("Вырежем половину нашей первой строки: " + inputLine1.substring(inputLine1.length() / 2));
        System.out.println("_________________________________________________________________");
        System.out.println("Вырежем половину нашей первой строки начиная с середины: " + inputLine1.substring(0, inputLine1.length() / 2));
        System.out.println("_________________________________________________________________");
        System.out.println("Заменяем первую половину первой строки на слово 'Один': " + inputLine1.replaceAll(inputLine1.substring(0, inputLine1.length() / 2), "Один"));
        System.out.println("_________________________________________________________________");
        System.out.println("Заменим первую строку на вторую: " + inputLine1.replaceFirst(inputLine1, inputLine2));
        System.out.println("_________________________________________________________________");
        System.out.println("Удаляем пробелы в начале и в конце первой строки: " + inputLine1.trim());
        System.out.println("_________________________________________________________________");
        System.out.println("Возвращаем первый элемент, за исключением пробела: " + inputLine1.trim().charAt(0));
        System.out.println("_________________________________________________________________");
        System.out.println("Юникод первого символа: " + inputLine1.trim().codePointAt(0));
        System.out.println("_________________________________________________________________");
        if (inputLine1.compareTo(inputLine2) > 0) {
            System.out.println("Первая строка лексически больше чем строка два");
        } else if (inputLine1.compareTo(inputLine2) == 0) {
            System.out.println("Первая строка и вторая строка лексически равны");
        } else if (inputLine1.compareTo(inputLine2) < 0) {
            System.out.println("Первая строка лексически меньше чем строка два");
        }
        System.out.println("_________________________________________________________________");
        System.out.println("HasCode первой строки равен: " + inputLine1.hashCode());
        System.out.println("_________________________________________________________________");
        System.out.println("Символ '" + inputLine1.substring(1, 2) + " 'является " + inputLine1.indexOf(inputLine1.substring(1, 2)) + " элементом строки");
        System.out.println("_________________________________________________________________");
        System.out.println("Введите строку, которая содержит несколько пробелов:");
        Scanner scanner3 = new Scanner(System.in);
        String inputLine3 = scanner1.nextLine();
        String[] array = inputLine3.split(" ");
        System.out.println("Разделим строку на пробелы: ");
        for (String word : array) {
            System.out.println(word);
        }
    }
}
