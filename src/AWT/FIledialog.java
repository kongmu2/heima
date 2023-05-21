package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FIledialog {
    public static void main(String[] args) {
        Frame frame=new Frame("测试窗口");

        FileDialog f1=new FileDialog(frame,"选择要打开的文件",FileDialog.LOAD);
        FileDialog f2=new FileDialog(frame,"选择要保存的文件",FileDialog.SAVE);



        Button b1 = new Button("打开文件");
        Button b2 = new Button("保存文件");


        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);

                String directory = f1.getDirectory();
                String file = f1.getFile();
                System.out.println("文件路径"+directory);
                System.out.println("文件名"+file);

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);

                String directory = f2.getDirectory();
                String file = f2.getFile();
                System.out.println("保存路径"+directory);
                System.out.println("保存名"+file);
            }
        });
        frame.add(b1,BorderLayout.SOUTH);
        frame.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
