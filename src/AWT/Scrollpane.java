package AWT;

import javax.swing.*;
import java.awt.*;

public class Scrollpane {
    public static void main(String[] args) {
        Frame frame=new Frame("测试窗口");
        //创建scrollpane
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//一直有滚动条

        sp.add(new Button("测试按钮"));
        sp.add(new JTextField("wenben"));

        frame.add(sp);


        frame.setBounds(100,100,800,600);
        frame.setVisible(true);
    }
}
