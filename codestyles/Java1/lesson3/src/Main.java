import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 30.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    public static void task2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String word, user;
        word = words[rand.nextInt(words.length)];
        Scanner sc = new Scanner(System.in);
        System.out.println("Я загадал слово попробуй угадать его");
        do {
            user = sc.nextLine();
            if (user.equals(word)) {
                System.out.println("Поздравляю ты угадал!");
            } else {
                String str = "";
                Boolean bool = false;
                for (int i = 0; i < word.length() && i < user.length(); i++) {
                    if (user.charAt(i) == word.charAt(i)) {
                        bool = true;
                        str += user.charAt(i);
                    } else {
                        str += "#";
                    }
                }

                if (bool) {
                    int lengStr = user.length();
                    if (user.length() > word.length()) {
                        lengStr = word.length();
                    }
                    for (int j = 0; j < 15 - lengStr; j++) {
                        str += "#";
                    }
                    System.out.println("Есть совпадения по буквам:");
                    System.out.println(str);
                } else {
                    System.out.println("Не угадал не одной буквы");
                }
            }
        } while (word != user);
    }

    public static void task1() {
        int random, user;
        Scanner sc = new Scanner(System.in);
        do {
            Random rand = new Random();
            random = rand.nextInt(10);
            System.out.println("Я загадал число от 0 до 9");
            System.out.println("Угадай число ");
            if (sc.hasNextInt()) {
                do {
                    user = sc.nextInt();
                    if (user == random) {
                        System.out.println("Поздравляю ты угадал ");
                    } else {
                        if (user < 0 || user > 9) {
                            System.out.println("Число не входит в заданный диапазон");
                        } else {
                            if (user < random) {
                                System.out.println("Мое число больше");
                            } else {
                                System.out.println("Мое число меньше");
                            }
                        }
                    }
                } while (user != random);

            } else {
                System.out.println("Вы ввели не верное число");
            }
            System.out.println("Если хочешь сыграть еще, введи число 1");
        } while (sc.nextInt() == 1);
        System.out.println("До скорых встреч!!!");
    }
}
