
/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private static List<String> createListEmployee(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("Василий");
        list.add("Семен");
        list.add("Кирилл");
        list.add("Артем");
        list.add("Сергей");

        return list;
    }

}