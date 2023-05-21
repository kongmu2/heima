package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 {
    JFrame jFrame=new JFrame("测试窗口");

    JMenuBar jMenuBar=new JMenuBar();

    JMenu file=new JMenu("文件");
    JMenu edit=new JMenu("编辑");

    JMenuItem auto =new JMenuItem("自动换行");
    JMenuItem copy =new JMenuItem("复制");
    JMenuItem paste =new JMenuItem("粘贴");

    JMenu formatmenu=new JMenu("格式");
    JMenuItem comment=new JMenuItem("注释");
    JMenuItem cancelcomment=new JMenuItem("取消注释");

    //文本域
    JTextArea textArea=new JTextArea(20,20);


    String [] color={"红色","绿色","蓝色"};
    JList<String> colorlist=new JList<String>(color);


    JComboBox<String> colorselect=new JComboBox<>();

    ButtonGroup group=new ButtonGroup();
    JRadioButton male=new JRadioButton("男",true);
    JRadioButton female=new JRadioButton("女",false);

    JCheckBox ismarry=new JCheckBox("是否已婚",true);


    JTextField textField=new JTextField(20);
    JButton ok=new JButton("确认");


    JPopupMenu popupMenu=new JPopupMenu();
    JRadioButtonMenuItem Metal=new JRadioButtonMenuItem("风格");
    JRadioButtonMenuItem Metal1=new JRadioButtonMenuItem("风格1");
    JRadioButtonMenuItem Metal2=new JRadioButtonMenuItem("风格2");
    JRadioButtonMenuItem Metal3=new JRadioButtonMenuItem("风格3");


    public void init(){
        //组装box
        edit.add(auto);
        edit.addSeparator();
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(formatmenu);

        formatmenu.add(comment);
        formatmenu.add(cancelcomment);

        jMenuBar.add(file);
        jMenuBar.add(edit);

        jFrame.setJMenuBar(jMenuBar);

        //文本域和列表组装
        JPanel cleft=new JPanel();
        cleft.add(colorselect);
        colorselect.addItem("红色");
        colorselect.addItem("绿色");
        colorselect.addItem("蓝色");

        group.add(male);
        group.add(female);
        cleft.add(male);
        cleft.add(female);
        cleft.add(ismarry);


        Box topleft = Box.createVerticalBox();
        topleft.add(textArea);
        topleft.add(cleft);

        Box top = Box.createHorizontalBox();
        top.add(cleft);
        top.add(colorlist);

        jFrame.add(top);

        //下菜单
        JPanel bottom=new JPanel();
        bottom.add(textField);
        bottom.add(ok);

        jFrame.add(bottom,BorderLayout.SOUTH);
        //右键菜单
        popupMenu.add(Metal);
        popupMenu.add(Metal1);
        popupMenu.add(Metal2);
        popupMenu.add(Metal3);

        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                try {
                    change(actionCommand);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        };
        Metal.addActionListener(listener);
        Metal1.addActionListener(listener);
        Metal2.addActionListener(listener);
        Metal3.addActionListener(listener);


        popupMenu.add(Metal);
        popupMenu.add(Metal1);
        popupMenu.add(Metal2);
        popupMenu.add(Metal3);

        textArea.setComponentPopupMenu(popupMenu);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new test1().init();
    }
    public void change(String command)throws Exception{
        switch (command){
            case "Metal":
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            case "Metal1":
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            case "Metal2":
                UIManager.setLookAndFeel("javax.swing.palf.metal.MetalLookAndFeel");
                break;
            case "Metal3":
                UIManager.setLookAndFeel("javax.swing.palf.metal.MetalLookAndFeel");
                break;
        }
        SwingUtilities.updateComponentTreeUI(jFrame.getContentPane());
        SwingUtilities.updateComponentTreeUI(jMenuBar);
        SwingUtilities.updateComponentTreeUI(popupMenu);
    }
}
