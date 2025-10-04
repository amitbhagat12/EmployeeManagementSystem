package employee.management.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame{

    public Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); // i2 is scaled image
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);

        
        setSize(1170,650); // Frame Size
        setLocation(200,50);  // Centre of screen (x & y axis)
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000); // 5 seconds
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}

// Swing → Java toolkit to build GUIs.

// JFrame → The window where you place your components.

// Thread → Allows pausing/waiting (or multitasking).

// Splash Screen → A temporary welcome screen shown at startup.
