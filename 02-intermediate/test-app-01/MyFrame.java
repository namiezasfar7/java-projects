//IMPORTS
import javax.swing.*;
import java.awt.*;

//MYFRAME CLASS
public class MyFrame extends JFrame {

    //INITIALIZE
    MyFrame(){

        this.setTitle("Test App 01");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x140B54));
        this.setVisible(true);
    }
}