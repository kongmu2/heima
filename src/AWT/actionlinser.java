package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionlinser {
    Frame frame=new Frame("测试");

    TextField tx=new TextField(30);
    Button b1=new Button("确认");

    public void init(){

        Mylisener mylisener=new Mylisener();

        b1.addActionListener(mylisener);

        frame.add(tx,BorderLayout.NORTH);
        frame.add(b1);

        frame.pack();
        frame.setVisible(true);
    }

    private class Mylisener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tx.setText("你好世界");
        }
    }


    public static void main(String[] args) {
        new actionlinser().init();
    }
}
