/**
 * Created by Администратор on 13.04.2017.
 */
public class Cat {
    String name;
    int vivid;
    Boolean hungry;

    public Cat(String name, int vivid) {
        this.vivid = vivid;
        this.name = name;
        this.hungry = true;
    }

    public void Feed(Plate plate) {
        if (hungry && plate.food >= vivid) {
            plate.takeFood(vivid);
            this.hungry = false;
        }
    }

    public void PrintInfo() {
        if (!hungry) {
            System.out.printf("Кошка %s сытая\n", name);
        } else {
            System.out.printf("Кошка %s голодная\n", name);
        }
    }
}
