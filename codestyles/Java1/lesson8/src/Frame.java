import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by infuntis on 14/04/17.
 */
public class Frame extends JFrame {
    JButton jb;

    public Frame(){
        setTitle("Крестики-нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(60,15,507,555);
        setResizable(false);
        setLayout(new BorderLayout());
        Map center = new Map(3);
        JPanel bottom = new JPanel(new GridLayout());
        JButton startB = new JButton("Start game");
        JButton endB = new JButton("End game");
        bottom.add(startB);
        bottom.add(endB);
        add(center,BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        endB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        startB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(getContentPane(),"Хотите начать новую игру?");
                if (result == 0){
                    center.startNewGame();
                }
            }
        });





        setVisible(true);
    }


}
