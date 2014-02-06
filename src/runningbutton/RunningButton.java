
package runningbutton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RunningButton {

    JButton runner;

    public RunningButton() {
        JFrame f = new JFrame();
        f.addMouseMotionListener(new Cursor());

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        runner = new JButton("Can't Catch Me!!!");
        runner.setSize(180, 40);
        runner.setLocation(175, 100);
        runner.addMouseListener(new ButtonClicked());
        f.add(runner);
        }
    
    public static void main(String[] args) {

        new RunningButton();

    }

    class Cursor extends MouseAdapter {

        @Override
        public void mouseMoved(MouseEvent e) {
           // System.out.println(e.getX() + ", " + e.getY());  

            if ((Math.abs(e.getX() - runner.getX())) < 300 && (Math.abs(e.getY() - runner.getY())) < 100) {

                Random random = new Random();
                runner.setLocation(random.nextInt(450), random.nextInt(450));
                }

        }
    }

    class ButtonClicked extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(null, "Congratulations - You Won!");
            }
    }
}
