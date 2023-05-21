package AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GAMEtanqiuxiaoyouxi {
    JFrame frame=new JFrame("弹球小游戏");

    //窗体大小
    private final int TABLE_WIDTH=400;
    private final int TBALE_HEIGHT=700;


    //平板子大小
    private final int RACKET_WIDTH=80;
    private final int RACKET_HEIGHT=10;


    //小球大小
    private final int BALL_SIZE=10;


    //小球坐标
    private int BALL_X=200;
    private int BALL_Y=10;

    //速度
    private int SPEED_X=10;
    private int SPEED_Y=5;

    //球拍坐标
    private int RACKET_X=180;
    private final int RACKET_Y=650;

    //表示结束
    private Boolean isover=false;

    //声明定时器
    private Timer timer;

    //绘制类
    public class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            if (isover){
                g.setColor(Color.BLACK);
                g.setFont(new Font("Times",Font.BOLD,30));
                g.drawString("游戏结束",50,200);
            }else {
                //绘制小球
                g.setColor(Color.red);

                g.fillOval(BALL_X,BALL_Y,BALL_SIZE,BALL_SIZE);

                //绘制球拍
                g.setColor(Color.BLUE);

                g.fillRect(RACKET_X,RACKET_Y,RACKET_WIDTH,RACKET_HEIGHT);


            }
        }
    }
    //创建绘画区域
    MyCanvas drawarea=new MyCanvas();



    public void init(){
        //关闭窗口事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        KeyListener key=new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode==KeyEvent.VK_LEFT){
                        if (RACKET_X>0){
                            RACKET_X-=5;
                        }
                }else if (keyCode==KeyEvent.VK_RIGHT){
                        if (RACKET_X<TABLE_WIDTH-RACKET_WIDTH){
                            RACKET_X+=5;
                        }
                }
            }
        };
        frame.addKeyListener(key);
        drawarea.addKeyListener(key);

        //小球坐标控制
        ActionListener task=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //根据边界修改方向
                if (BALL_X<=0||BALL_X>=(TABLE_WIDTH-BALL_SIZE)){
                    SPEED_X=-SPEED_X;
                }
                if (BALL_Y<=0||(BALL_Y>RACKET_Y-BALL_SIZE&&BALL_X>RACKET_X&&BALL_X<RACKET_X+RACKET_WIDTH)){
                    SPEED_Y=-SPEED_Y;
                }
                //游戏结束或重新开始
                if (BALL_Y>RACKET_Y-BALL_SIZE&&(BALL_X<RACKET_X||BALL_X>RACKET_X+RACKET_WIDTH)){
                    timer.stop();
                    isover=true;

                    drawarea.repaint();
                }


                BALL_X+=SPEED_X;
                BALL_Y+=SPEED_Y;

                drawarea.repaint();
            }
        };
        timer=new Timer(100,task);
        timer.start();

        drawarea.setPreferredSize(new Dimension(TABLE_WIDTH,TBALE_HEIGHT));
        frame.add(drawarea);

        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
            new GAMEtanqiuxiaoyouxi().init();
    }
}
