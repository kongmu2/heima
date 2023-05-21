package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layoutmanager {
    public static void main(String[] args) {


//        flowlayout();
//        borderlayout();


//        gridlayout();

//          cardlayout();

        boxlayout();


    }



    public static void flowlayout(){
        Frame frame=new Frame("测试窗口");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//设置左对齐，水平间距和垂直间距

        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+i));
        }

        frame.pack();
        frame.setVisible(true);
    }
    public static void borderlayout(){
        Frame frame=new Frame("边界布局管理器");

        frame.setLayout(new BorderLayout(30,30));

        frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
    private static void gridlayout() {
        Frame frame=new Frame("计算器");

        Panel p=new Panel();
        p.add(new TextField(30),BorderLayout.NORTH);
        Panel p1=new Panel();
        p1.setLayout(new GridLayout(3,4,4,4));

        for (int i = 0; i < 10; i++) {
            p1.add(new Button(i+""));
        }

        p1.add(new Button("+"));
        p1.add(new Button("-"));
        p1.add(new Button("*"));
        p1.add(new Button("/"));
        p1.add(new Button("="));

        frame.add(p,BorderLayout.NORTH);
        frame.add(p1);
        frame.pack();
        frame.setVisible(true);
    }
    private static void cardlayout() {
        Frame frame=new Frame();

        Panel p=new Panel();

        CardLayout card = new CardLayout();

        p.setLayout(card);
        String[] names={"第一张","第二张","第三张","第四张"};

        for (int i = 0; i < names.length; i++) {
            p.add(names[i],new Button(names[i]));
        }
        frame.add(p);

        Panel p1=new Panel();

        Button b1=new Button("上一页");
        Button b2=new Button("下一页");
        Button b3=new Button("第一页");
        Button b4=new Button("最后一页");
        Button b5=new Button("第三页");

        //事件监听器
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand){
                    case "上一页":
                        card.previous(p);
                        break;
                    case "下一页":
                        card.next(p);
                        break;
                    case "第一页":
                        card.first(p);
                        break;
                    case "最后一页":
                        card.last(p);
                        break;
                    case "第三页":
                        card.show(p,"第三页");
                        break;
                }
            }
        };

        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);

        frame.add(p);
        frame.add(p1,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private static void boxlayout() {
        Frame frame=new Frame("测试box");

        Panel p1=new Panel();
//        p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));

        p1.add(new Button("按钮1"));

        p1.add(new Button("按钮2"));

        frame.add(p1,BorderLayout.NORTH);

        //盒子
        Box hbox=Box.createHorizontalBox();

        //固定大小的间距
        hbox.add(Box.createHorizontalGlue());
        hbox.add(new Button("水平按钮1"));
        //指定大小的间距
        hbox.add(Box.createHorizontalStrut(30));
        hbox.add(new Button("水平按钮2"));

        Box vbox=Box.createVerticalBox();

        vbox.add(new Button("垂直按钮1"));
        vbox.add(Box.createVerticalGlue());
        vbox.add(new Button("垂直按钮2"));
        vbox.add(Box.createVerticalStrut(30));



        frame.add(hbox,BorderLayout.CENTER);
        frame.add(vbox,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

}
