package AWT;

import javax.swing.*;
import java.awt.*;

public class frame {
    public static void main(String[] args) {

        Frame frame=new Frame("这是窗口");


        Panel p=new Panel();

        p.add(new JTextField("这是文本域"));
        p.add(new Button("按钮"));

        frame.add(p);

        frame.setBounds(100,100,800,600);


        frame.setVisible(true);
    }
}
