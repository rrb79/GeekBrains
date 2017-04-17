/**
 * Created by Администратор on 13.04.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate();
        // Plate plate = new Plate(43);
        Cat[] cats = new Cat[]{
                new Cat("Mashka", 10),
                new Cat("Murka", 15),
                new Cat("Liza", 12)};
        for (int i = 0; i < cats.length; i++) {
            cats[i].Feed(plate);
            cats[i].PrintInfo();
        }
    }
}
