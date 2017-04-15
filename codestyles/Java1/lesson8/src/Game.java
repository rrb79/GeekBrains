import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 15.04.2017.
 */
public class Game {
    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static int fieldSize = 3;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if(checkWinX('X')){
                System.out.println("Вы победили!");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWinX('O')){
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Game over");

    }

    public static boolean checkWinX(char dot){
        for (int i = 0; i < 3; i++) {
            if(checkLine(i,0,0,1,3,dot)){
                return true;
            }//проверка вертикалей
            if(checkLine(0,i,1,0,3,dot)){
                return true;
            }//проверка горизонталей
        }
        if(checkLine(0,0,1,1,3,dot)){
            return true;
        }
        if(checkLine(0,2,1,-1,3,dot)){
            return true;
        }
        return false;

    }



    public static boolean checkLine(int cx, int cy, int vx, int vy, int l, char c){
        for (int i = 0; i < l; i++) {
            if(map[cy+i*vy][cx+i*vx]!=c){
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char dot){
        if(map[0][0] == dot && map[0][1] == dot && map[0][2] == dot){
            return true;
        }
        if(map[1][0] == dot && map[1][1] == dot && map[1][2] == dot){
            return true;
        }
        if(map[2][0] == dot && map[2][1] == dot && map[2][2] == dot){
            return true;
        }

        if(map[0][0]== dot && map[1][0] == dot && map[2][0] == dot){
            return true;
        }
        if(map[0][1]== dot && map[1][1] == dot && map[2][1] == dot){
            return true;
        }
        if(map[0][2]== dot && map[1][2] == dot && map[2][2] == dot){
            return true;
        }
        if(map[0][0] == dot && map[1][1] == dot && map[2][2] == dot){
            return true;
        }
        if(map[2][0] == dot && map[1][1] == dot && map[0][2] == dot){
            return true;
        }
        return false;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (map[i][j] == '*'){
                    return false;
                }
            }
        }
        return true;
    }


    public static void aiTurn(){
        int x ,y;
        do{
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        }while(!isCellValid(x,y));
        map[y][x] = 'O';
    }

    public static boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        if(map[y][x] == '*'){
            return true;
        }
        return false;
    }

    public static void humanTurn(){
        int x,y;
        do {
            System.out.println("Введите ячейку в формате x y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }while(!isCellValid(x,y));
        map[y][x] = 'X';
    }

    public static void printMap()
    {

        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();

    }
    public static void initMap(){
        map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                map[i][j] = '*';
            }
        }
    }

}
