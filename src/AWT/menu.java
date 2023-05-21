package AWT;

import java.awt.*;
import java.awt.event.*;

public class menu {
    Frame frame=new Frame("测试窗口");

    MenuBar menuBar=new MenuBar();

    Menu filemenu=new Menu("文件");
    Menu editmenu=new Menu("编辑");
    Menu formatmenu=new Menu("格式");


    MenuItem auto=new MenuItem("自动换行");
    MenuItem copy=new MenuItem("复制");
    MenuItem paste=new MenuItem("粘贴");

    MenuItem comment=new MenuItem("注释 ctrl+shift+Q",new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem cancel=new MenuItem("取消注释");

    TextArea ta=new TextArea(6,9);



    public void init(){
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

        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("您点击了注释"+e.getActionCommand());
            }
        });

        formatmenu.add(comment);
        formatmenu.add(cancel);

        editmenu.add(auto);
        editmenu.add(copy);
        editmenu.add(paste);
        editmenu.add(formatmenu);


        menuBar.add(filemenu);
        menuBar.add(editmenu);

        frame.setMenuBar(menuBar);

        frame.add(ta);

        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new menu().init();
    }
}
