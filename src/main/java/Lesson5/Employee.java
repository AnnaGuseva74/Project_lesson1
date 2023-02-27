package Lesson5;

public class Employee {
    String fullName;
    String jobTitle;
    String mail;
    String telephone;
    int salary;
    int age;
    public int getAge(){
        return age;
    }

    public Employee(String fullName, String jobTitle, String mail, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.mail = mail;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void print() {
        System.out.println("ФИО: " + fullName + " | " + " Должность: " + jobTitle + " | " + " e-mail: " + mail + " | " +
                " Тел.: " + telephone + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);

    }

}


