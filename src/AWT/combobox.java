package AWT;

import javax.swing.*;
import java.awt.*;

public class combobox {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(combobox::createAndShowGUI);
    }
    public static void createAndShowGUI(){
        JFrame f=new JFrame("JFrame窗口");
        f.setLayout(new BorderLayout());
        f.setSize(1000,600);
        f.setVisible(true);
        f.setLocation(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        JComboBox<String> comboBox=new JComboBox<>();
        comboBox.addItem("请选择城市");
        comboBox.addItem("北京");
        comboBox.addItem("天津");
        comboBox.addItem("南京");
        comboBox.addItem("上海");


        JTextField textField=new JTextField(20);
        comboBox.addActionListener(e->{
            String item=(String) comboBox.getSelectedItem();
            if("请选择城市".equals(item)){
                textField.setText("");
            }else {
                textField.setText("您选择的城市是："+item);
            }
        });
        p.add(comboBox);
        p.add(textField);
        f.add(p,BorderLayout.PAGE_START);
    }
}
