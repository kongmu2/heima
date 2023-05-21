package AWT;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class bufferimage {
    private Frame frame=new Frame("绘图窗口");

    //绘画DEMO

    //画布大小
    private final int AREA_WIDTH=500;
    private final int AREA_HEIGHT=400;

    //右键弹出菜单
    private PopupMenu popupMenu=new PopupMenu();
    private MenuItem menu1=new MenuItem("蓝色");
    private MenuItem menu2=new MenuItem("红色");
    private MenuItem menu3=new MenuItem("绿色");

    //设置画笔颜色
    private Color Pencilcolor=Color.BLACK;


    BufferedImage bufferedImage=new BufferedImage(AREA_WIDTH,AREA_HEIGHT,BufferedImage.TYPE_INT_RGB);

    Graphics g=bufferedImage.getGraphics();

    public class mycanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(bufferedImage,0,0,null);
        }
    }
    mycanvas area=new mycanvas();

    private int preX=-1;
    private int preY=-1;


    public void init(){
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand){
                    case "红色":
                        Pencilcolor=Color.RED;
                        break;
                    case "绿色":
                        Pencilcolor=Color.GREEN;
                        break;
                    case "蓝色":
                        Pencilcolor=Color.BLUE;
                        break;
                }
            }
        };
        menu1.addActionListener(actionListener);
        menu2.addActionListener(actionListener);
        menu3.addActionListener(actionListener);

        popupMenu.add(menu1);
        popupMenu.add(menu2);
        popupMenu.add(menu3);

        area.add(popupMenu);

        area.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean popupTrigger = e.isPopupTrigger();//判断是否是右键鼠标
                if (popupTrigger){
                    popupMenu.show(area,e.getX(),e.getY());
                }
                preX=-1;
                preY=-1;

                area.repaint();
            }
        });

        //设置画布为白色
        g.setColor(Color.WHITE);
        g.fillRect(0,0,AREA_WIDTH,AREA_HEIGHT);


        //监听鼠标移动
        area.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (preX>0&&preY>0){
                    g.setColor(Pencilcolor);
                    //画画轨迹
                    g.drawLine(preX,preY,e.getX(),e.getY());
                }
                //修正坐标
                preX=e.getX();
                preY=e.getY();

                area.repaint();

            }
        });
        area.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
        frame.add(area);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

            frame.pack();
            frame.setVisible(true);
    }
    public static void main(String[] args) {
        new bufferimage().init();
    }
}
