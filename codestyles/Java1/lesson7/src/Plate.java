import java.util.Scanner;

/**
 * Created by Администратор on 13.04.2017.
 */
public class Plate {
    int food;

    public Plate() {
        addFood();
    }

    public Plate(int food) {
        this.food = food;
    }

    public void addFood() {
        Scanner sc = new Scanner(System.in);
        int food;
        food = 0;
        do {
            System.out.print("Введите количество еды: ");
            if (sc.hasNextInt()) {
                food = sc.nextInt();
            } else {
                System.out.println("Введите целое число!");
            }
        } while (food <= 0);
        this.food = food;
    }

    public void takeFood(int food) {
        this.food -= food;
    }
}
