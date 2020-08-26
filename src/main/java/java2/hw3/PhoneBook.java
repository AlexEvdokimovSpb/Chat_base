package java2.hw3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook; // ключ - имя, значение - лист номеров

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phone){ // метод добавления телефона
        if(phoneBook.containsKey(name)){ // если ключ-имя уже существует
            ArrayList<String> phones = phoneBook.get(name); // по ключу передаем массив телефонов
            if(!phones.contains(phone)){ // проверяем что телефон отсутвует
                phones.add(phone); // и вставляем телефон в массив
            }
        } else {
            ArrayList<String> newPhones = new ArrayList<>(); // создаем массив телефонов
            newPhones.add(phone); // вставляем телефон в массив
            phoneBook.put(name, newPhones); //  добавляем имя и массив с телефоном
        }
    }

    public void get(String name){ // метод получения телефона по имени
        if(phoneBook.containsKey(name)){ // проверяем есть ли такое имя
            System.out.println("У "+name+ " телефоны: " + phoneBook.get(name)); // выводим имя и телефоны
        } else {
            System.out.println("В телефонной книге нет имени "+name); // информируем, что имени нет
        }
    }

}
