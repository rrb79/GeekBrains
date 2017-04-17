import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by infuntis on 14/04/17.
 */
public class Map extends JPanel {
    private int linesCount;
    private final int PANEL_SIZE = 500;
    private int cellSize;
    private int[][] map;
    private final int PLAYER_1 = 1;
    private final int PLAYER_2 = 2;
    private boolean cleanField = false;
    static Random rnd = new Random();

    public Map(int linesCount){
        this.linesCount = linesCount;
        this.cellSize = PANEL_SIZE/linesCount;
        map = new int[linesCount][linesCount];
        setBackground(Color.white);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX()/cellSize;
                int y = e.getY()/cellSize;
                map[x][y] = PLAYER_1;
                repaint();
            }
        });
//        if(checkWinX(PLAYER_1)){
//            System.out.println("Вы победили!");
//            break;

        aiTurn();
        repaint();
    }

    public void aiTurn(){
        int x ,y;
        do{
            x = rnd.nextInt(linesCount);
            y = rnd.nextInt(linesCount);
        }while(!isCellValid(x,y));
        map[x][y] = PLAYER_2;
    }

    public boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > linesCount-1 || y > linesCount-1){
            return false;
        }
        if(map[x][y] == PLAYER_2 && map[x][y] == PLAYER_1){
            return true;
        }
        return false;
    }


    public void startNewGame(){
        map = new int[linesCount][linesCount];
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

            for (int i = 0; i < linesCount; i++) {
                g.drawLine(0, i * cellSize, PANEL_SIZE, i * cellSize);
                g.drawLine(i * cellSize, 0, i * cellSize, PANEL_SIZE);
            }
            for (int i = 0; i < linesCount; i++) {
                for (int j = 0; j < linesCount; j++) {
                    if (map[i][j] != 0) {
                        if (map[i][j] == PLAYER_1) {
                            g.setColor(Color.red);
                        }
                        if (map[i][j] == PLAYER_2) {
                            g.setColor(Color.BLUE);
                        }
                        g.fillOval(i * cellSize, j * cellSize, cellSize - 5, cellSize - 5);
                    }
                }
            }

    }
}
