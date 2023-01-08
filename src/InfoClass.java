import java.util.ArrayList;
import java.util.Arrays;

public class InfoClass {
    private String name;
    private String surName;
    private int age;
    private String[] hobbies;
    private Long inn;
    private Double height;
    private Double weight;

    public InfoClass() {
        this.name = "Ayaz";
        this.surName = "Imamov";
        this.age = 23;
        this.hobbies = new String[]{"film", "music", "game", "crypto"};
        this.inn = 1234567789L;
        this.height = 169.2;
        this.weight = 67.8;
    }

    public InfoClass(String name, String surName, int age, String[] hobbies, Long inn, Double height, Double weight) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.hobbies = hobbies;
        this.inn = inn;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Long getInn() {
        return this.inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
