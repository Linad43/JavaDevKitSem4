
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

public class Main {
    public static void main(String[] args) {
        listEmployee = createListEmployee();
        System.out.println(findExp(2));
        System.out.println(findNumPhone("Vasiliy"));
        System.out.println(findTabNum(4312));
        addNewEmployee(1034,"79995550044", "Andrey", 8);
        for (Employee empl:listEmployee) {
            System.out.println(empl);
        }

    }
    private static List<Employee> listEmployee;
    private static List<Employee> createListEmployee(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1234,"79995556644", "Viktor", 3));
        list.add(new Employee(4321,"79994445544", "Semen", 1));
        list.add(new Employee(4312,"79993335566", "Daniil", 4));
        list.add(new Employee(2143,"79994449944", "Aleksandr", 2));
        list.add(new Employee(1342,"79991115544", "Vasiliy", 5));
        return list;
    }
    private static List<Employee> findExp(int findExp){
        List<Employee> list = new ArrayList<>();
        for (Employee empl:listEmployee) {
            if (empl.getExp()==findExp){
                list.add(empl);
            }
        }
        return list;
    }
    private static List<String> findNumPhone(String findName){
        List<String> list = new ArrayList<>();
        for (Employee empl:listEmployee) {
            if (empl.getName().equals(findName)){
                list.add(empl.getNumPhone());
            }
        }
        return list;
    }
    private static List<Employee> findTabNum(int findTabNum){
        List<Employee> list = new ArrayList<>();
        for (Employee empl:listEmployee) {
            if (empl.getTabNum()==findTabNum){
                list.add(empl);
            }
        }
        return list;
    }
    private static void addNewEmployee(Employee employee){
        listEmployee.add(employee);
    }
    private static void addNewEmployee(int tabNum, String numPhone, String name, int exp){
        addNewEmployee(new Employee(tabNum,numPhone,name,exp));
    }
}