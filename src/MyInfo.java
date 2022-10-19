import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyInfo {
    public static void main(String[] args) {
        String Name = "Ayaz";
        String Surname = "Imamov";
        int age = 23;
        List<String> hobbies = new ArrayList<>(Arrays.asList("film","music","game","crypto"));
        Long INN = 12345677890L;
        Double height = 169.2;
        Double weight = 67.6; //вес

        System.out.println("Информация обо мне:");
        System.out.println("Имя: " + Name);
        System.out.println("Фамилия: " + Surname);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobbies);
        System.out.println("Индивидуальный номер налогоплательщика: " + INN);
        System.out.println("______Немного более личного______");
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
    }

}
