
import gui.MainWindow;

import javax.swing.*;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        JFrame j = new JFrame();
        j.setTitle("Dijkstra Algorithm");
        j.setExtendedState(MAXIMIZED_BOTH);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setUndecorated(true);
        j.add(new MainWindow());
        j.setVisible(true);

    }

}
