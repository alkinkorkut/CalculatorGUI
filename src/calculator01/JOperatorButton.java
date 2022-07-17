package calculator01;

import javax.swing.*;
import java.awt.*;

public class JOperatorButton extends JButton {
    private Font font = new Font("Courier", Font.PLAIN,20);
    private Color color = new Color(204,204,204);

    public JOperatorButton(String text){
        super(text);
        this.setFont(this.font);
        this.setBackground(this.color);
    }
}
