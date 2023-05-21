package AWT;

import java.awt.*;
import java.awt.event.*;

public class popupmenu {
    public static void main(String[] args) {
        Frame frame=new Frame("测试框");
        TextArea ta=new TextArea("你好世界",6,6);
        Panel p=new Panel();

        PopupMenu popupMenu=new PopupMenu();

        MenuItem comment=new MenuItem("注释");
        MenuItem cancelcomment=new MenuItem("取消注释");
        MenuItem copy=new MenuItem("复制");
        MenuItem paste=new MenuItem("粘贴");

        popupMenu.add(comment);
        popupMenu.add(cancelcomment);
        popupMenu.add(copy);
        popupMenu.add(paste);

        //注册监听
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                System.out.println("您点击了"+actionCommand);
                switch (actionCommand){
                    case "注释":
                        ta.append("注释");
                        break;
                    case "取消注释":
                        ta.append("取消注释");
                        break;
                    case "复制":
                        ta.append("复制");
                        break;
                    case "粘贴":
                        ta.append("粘贴");
                        break;
                }

            }
        };
        comment.addActionListener(actionListener);
        cancelcomment.addActionListener(actionListener);
        copy.addActionListener(actionListener);
        paste.addActionListener(actionListener);

        p.add(popupMenu);
        p.setPreferredSize(new Dimension(400,600));


        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();
                if (flag){
                    popupMenu.show(p,e.getX(),e.getY());
                }
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
        });

        frame.add(ta);
        frame.add(p,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
