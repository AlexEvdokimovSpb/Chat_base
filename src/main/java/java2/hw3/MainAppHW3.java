package java2.hw3;

import java.util.*;

public class MainAppHW3 {

    public static void main(String[] args) {

        // задание 1
        // формируем тестовый ArrayList строк
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Слово повторятся дважды");
        arrayList.add("Слово повторятся трижды");
        arrayList.add("Уникальное 1");
        arrayList.add("Уникальное 2");
        arrayList.add("Уникальное 3");
        arrayList.add("Слово повторятся трижды");
        arrayList.add("Уникальное 4");
        arrayList.add("Уникальное 5");
        arrayList.add("Слово повторятся трижды");
        arrayList.add("Уникальное 6");
        arrayList.add("Слово повторятся дважды");
        arrayList.add("Уникальное 7");
        arrayList.add("Уникальное 8");
        arrayList.add("Уникальное 9");

        System.out.println(arrayList); // печатаем для проверки

        Map<String, Integer> map = new TreeMap<>(); // формируем Map где ключ=строка, значение=число одинаковых строк

        for (int i = 0; i < arrayList.size(); i++) { // последовательно проходим по всему arrayList
            String word = arrayList.get(i); // вводим временую переменную, которой присваиваем i строку. Далее используем как ключ
            Integer value = map.getOrDefault(word,0); // вводим временую переменную, которой присваиваем значение ключа. Если ключ встречается первый раз, значение по умолчанию "0"
            map.put(word, value + 1); // увеличиваем значение на еденицу
        }
        System.out.println(map); // печатаем. В результате выводится уникальные строки и колличество повторов

        //задание 2

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Элтон Джон", "777");
        phoneBook.add("Элтон Джон", "888-88-88");
        phoneBook.add("Дональд", "10");
        phoneBook.add("Дональд", "10-10-10");
        phoneBook.add("Дональд", "0000");
        phoneBook.add("Ким", "0000");

        phoneBook.get("Элтон Джон");
        phoneBook.get("Дональд");
        phoneBook.get("Ким");
        phoneBook.get("Владимир Владимирович");

    }

}
