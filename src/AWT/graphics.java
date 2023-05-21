package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class graphics {
    private final String RECT_SHAPE="rect";
    private final String OVAL_SHAPE="oval";


    private String shape="";
    private class mycanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            if (shape.equals(RECT_SHAPE)){
                g.setColor(Color.BLACK);
                g.drawRect(100,100,30,30);


            }else if (shape.equals(OVAL_SHAPE)){
                g.setColor(Color.BLUE);
                g.drawOval(100,100,30,30);
            }
        }
    }

    mycanvas drawarea=new mycanvas();

    public void init(){
        Frame frame=new Frame("测试框");

        Button b1=new Button("绘制矩形");
        Button b2=new Button("绘制椭圆");


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 shape=RECT_SHAPE;
                 drawarea.repaint();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape=OVAL_SHAPE;
                drawarea.repaint();
            }
        });


        Panel p=new Panel();
        p.add(b1);
        p.add(b2);
        frame.add(p,BorderLayout.SOUTH);

        drawarea.setPreferredSize(new Dimension(300,300));
        frame.add(drawarea);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new graphics().init();
    }
}
