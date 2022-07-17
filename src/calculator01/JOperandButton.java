package calculator01;

import javax.swing.*;
import java.awt.*;

public class JOperandButton extends JButton {
    private Font font = new Font("Courier", Font.PLAIN,20);
    private Color color = new Color(255,255,255);

    public JOperandButton(String text){
        super(text);
        this.setFont(this.font);
        this.setBackground(this.color);
    }
}
