package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees [0] = new Employee("Иванов Иван", "Директор", "123@mail.ru", "89998881234", 80000, 52);
        employees [1] = new Employee("Петров Петр", "Заместитель", "124@mail.ru", "89998881235", 60000, 46);
        employees [2] = new Employee("Ващенко Иван", "Менеджер", "125@mail.ru", "89998881236", 65000, 37);
        employees [3] = new Employee("Краснова Ирина", "Администратор", "126@mail.ru", "89998881237", 35000, 30);
        employees [4] = new Employee("Федотова Кристина", "Секретарь", "127@mail.ru", "89998881238", 37000, 35);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.print();
            }
        }
    }
}
