package AWT;

import java.awt.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JMenuBar {
    private static void createAndShowGUI(){
        //容器窗口
        JFrame f = new JFrame("简易记事本");
        f.setLayout(new BorderLayout());
        f.setSize(1200, 1000);
        f.setLocation(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //菜单
        //菜单栏
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
        //菜单项
        JMenu menu = new JMenu("文件");
        menuBar.add(menu);
        //三个菜单项组件
        JMenuItem item1 = new JMenuItem("打开");
        JMenuItem item2 = new JMenuItem("保存");
        JMenuItem item3 = new JMenuItem("退出");
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.addSeparator();
        menu.add(item3);
        f.setJMenuBar(menuBar);

        //编辑
        JTextArea inputField = new JTextArea(57, 106);
        JPanel panel = new JPanel();//面板
        panel.add(inputField);
        f.add(panel, BorderLayout.PAGE_START);

        //保存
        item2.addActionListener(e->{
            //新创一个弹框记录保存路径
            JFrame f1 = new JFrame("保存路径");
            f1.setSize(500, 200);
            f1.setLocation(500, 500);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            //文本进行获取
            JTextField input = new JTextField(40);
            JButton btn = new JButton("保存");
            JPanel panel1 = new JPanel();
            panel1.add(input);
            f1.add(panel1, BorderLayout.PAGE_START);
            f1.add(btn, BorderLayout.PAGE_END);
            btn.addActionListener(d->{
                try {
                    String content = input.getText();
                    FileWriter writer = new FileWriter(content);
                    writer.write(inputField.getText());
                    writer.close();
                    f1.dispose();
                }catch(IOException E)
                {
                    E.printStackTrace();
                }
            });
        });

        //打开
        //基本同上
        item1.addActionListener(ee->{
            JFrame f2 = new JFrame("打开路径");
            f2.setSize(501, 201);
            f2.setLocation(501, 501);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            JTextField input = new JTextField(40);
            JButton btn1 = new JButton("打开");
            JPanel panel2 = new JPanel();
            panel2.add(input);
            f2.add(panel2, BorderLayout.PAGE_START);
            f2.add(btn1, BorderLayout.PAGE_END);
            btn1.addActionListener(d->{
                try {
                    String content1 = input.getText();
                    FileReader reader = new FileReader(content1);
                    BufferedReader br = new BufferedReader(reader);
                    String str;
                    while((str = br.readLine()) != null)
                        inputField.setText(str);
                    br.close();
                    f2.dispose();
                }catch(IOException E)
                {
                    E.printStackTrace();
                }
            });
        });

        //退出
        item3.addActionListener(e->System.exit(0));
    }
    public static void main(String[] args)
    {
        createAndShowGUI();
    }
}
