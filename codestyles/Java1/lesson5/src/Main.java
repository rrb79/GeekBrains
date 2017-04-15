/**
 * Created by Администратор on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ярмиева Людмила", "Технолог", "yarmieva@bulyak.ru", "+79171234568", 20000, 47);
        persArray[1] = new Person("Гайнуллина Ирина", "Главный бухгалтер", "gainullina@bulyak.ru", "+79171234567", 35000, 38);
        persArray[2] = new Person("Беляева Наталья", "Завхоз", "belyaeva@bulyak.ru", "+79171234590", 22000, 32);
        persArray[3] = new Person("Гараев Рим", "Водитель", "garaev@bulyak.ru", "+79171234100", 22000, 52);
        persArray[4] = new Person("", "Уборщица", "belyaeva@bulyak.ru", "+79171234591", 18000, 56);
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].PrintPerson();
            }
        }
    }
}
