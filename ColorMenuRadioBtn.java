import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColorMenuRadioBtn implements ActionListener {
    private Color color;
    private JPanel jPanel2;

    public ColorMenuRadioBtn(Color color, JPanel jPanel2) {
        this.color = color;
        this.jPanel2 = jPanel2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jPanel2.setBackground(color);
    }
}
