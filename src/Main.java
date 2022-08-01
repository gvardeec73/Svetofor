import javax.swing.*;
import java.awt.*;

public class Main extends JPanel{

    public  void paintComponent(Graphics g) {
        super.paintComponent(g);
        int height = 550;
        int width = 550;
        System.out.println(width);
        g.setColor(Color.black);
        g.fillRoundRect(width / 2 - 60,height / 9 , 120, height / 9 * 5, 50,50);
        g.setColor(Color.white);
       // g.clearRect(width / 2 - 60,height / 9 , 123, height / 9 * 5);
        //g.fillRect(100,100,200,200);

    }


    public static void main(String[] args) {
        final int width = 546;
        final int height = 546;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Main());
        frame.setSize(width,height);
        frame.setVisible(true);

    }
}
