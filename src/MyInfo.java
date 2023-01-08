import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyInfo {
    public static void main(String[] args) {
        String[] hobbies = {"film", "music", "game", "crypto"};
        InfoClass MyInfo = new InfoClass("Ayaz", "Imamov", 23, hobbies, 12345677890L, 169.2, 67.6);


        System.out.println("Информация обо мне:");
        System.out.println("Имя: " + MyInfo.getName());
        System.out.println("Фамилия: " + MyInfo.getSurName());
        System.out.println("Возраст: " + MyInfo.getAge());
        System.out.println("Хобби: " + MyInfo.getHobbies());
        System.out.println("Индивидуальный номер налогоплательщика: " + MyInfo.getInn());
        System.out.println("______Немного более личного______");
        System.out.println("Рост: " + MyInfo.getHeight());
        System.out.println("Вес: " + MyInfo.getWeight());
    }

}
