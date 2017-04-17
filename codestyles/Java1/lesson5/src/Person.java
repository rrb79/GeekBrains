/**
 * Created by Администратор on 06.04.2017.
 */
public class Person {
    private String name, job, mail, phone;
    private int pay, age;

    public Person(String name, String job, String mail, String phone, int pay, int age) {
        this.name = name;
        this.job = job;
        this.mail = mail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void PrintPerson() {
        System.out.printf("Имя: %s должность: %s e-mail: %s тел.: %s зарплата: %d руб. возраст %d лет \n", name, job, mail, phone, pay, age);
    }

    public int getAge() {
        return age;
    }
}