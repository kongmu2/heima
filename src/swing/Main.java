package swing;

import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("表格背景透明");
        ImageIcon icon = new ImageIcon("img//background.jpg");    // 设置图片位置，这里在当前文件夹
        JLabel lab = new JLabel(icon);               // 将图片放入到label中
        JButton button=new JButton("按钮");
        lab.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());

        // 设置jtable的单元格为透明的
        JTable t = new JTable(20, 3) {
            private static final long serialVersionUID = 1L;
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (c instanceof JComponent) {
                    ((JComponent) c).setOpaque(false);
                }
                return c;
            }
        };
        t.setOpaque(false);
        // jframe本身是窗体，不能放置任何组件，用getContentPane()方法
        // 得到frame的默认内容面板，将lab放入其中，-1表示放入面板的下层

        frame.getContentPane().add(lab, -1);
        frame.getContentPane().add(t, 0); // 0表示放在面板的最顶层
        Container con = frame.getContentPane();
        ((JPanel) con).setOpaque(false); // 设置面板为透明的
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
