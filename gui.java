import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.AttributeSet.ColorAttribute;
public class gui {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        
        frame.add(label);

        frame.setTitle("Dice Game");
        frame.setSize(420,420);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Dice.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(23,150,155));
        ImageIcon image1 = new ImageIcon("welcome.jpg");
        
        
        label.setIcon(image1);
        label.setText("Welcome to the Dice Game");
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(50, 50, 150, 150);
    }
}
