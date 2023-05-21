package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTDialog {
    public static void main(String[] args) {
        Frame frame=new Frame();

        Dialog motrue = new Dialog(frame, "模式对话框", true);
        Dialog mofalse = new Dialog(frame, "非模式对话框", false);


        motrue.setBounds(30,40,300,300);
        mofalse.setBounds(30,40,300,300);


        Panel p1=new Panel();
        p1.add(new TextField(50));
        p1.add(new Button("确认"),BorderLayout.NORTH);
        motrue.add(p1);




        Button b1=new Button("打开模式对话框");
        Button b2=new Button("打开非模式对话框");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                motrue.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mofalse.setVisible(true);
            }
        });




        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
