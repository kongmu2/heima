package AWT;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;

public class GAMEwuziqiyouxi {
    private JFrame frame=new JFrame("五子棋");
    //声明四个image对象
    BufferedImage table;
    BufferedImage black;
    BufferedImage white;
    BufferedImage selected;

    //定义棋盘的宽和高
    final int TABLE_WIDTH=535;
    final int TABLE_HEIGHT=536;


    //声明棋盘垂直和水平可下的子数
    final int BOARD_SIZE=15;

    //每个棋子占用棋盘的大小比例
    final int RATE=TABLE_WIDTH/BOARD_SIZE;

    //声明变量棋子的偏移量
    final int X_OFFSET=5;
    final int Y_OFFSET=6;


    //声明一个二维数组记录棋子落子位置 board[i][j]处的值若是  0则没有棋子  1表示白棋  2表示黑棋
    int[][] board=new int[BOARD_SIZE][BOARD_SIZE];


    //声明红色选择框的坐标
    int selected_X=-1;
    int selected_Y=-1;




    //自定义类继承canvas
    public class ChessBoard extends JPanel{
        @Override
        public void paint(Graphics g) {
        //绘图
            //绘制棋盘
            g.drawImage(table,0,0,null);
            //绘制选择框
            if (selected_X>0&&selected_Y>0) {
                g.drawImage(selected,selected_X*RATE+X_OFFSET,selected_Y*RATE+Y_OFFSET,null);
            }
            //绘制棋子
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    //绘制黑棋
                        if (board[i][j]==2){
                            g.drawImage(black,i*RATE+X_OFFSET,j*RATE+Y_OFFSET,null);
                        }
                    //绘制白棋
                    if (board[i][j]==1){
                        g.drawImage(white,i*RATE+X_OFFSET,j*RATE+Y_OFFSET,null);
                    }

                }
            }


        }
    }
    ChessBoard chessBoard=new ChessBoard();

    //变量记录下棋颜色
    int board_type=2;

    //底部配件
    Panel p=new Panel();
    Button whitebtn=new Button("白棋");
    Button blackbtn=new Button("黑棋");
    Button deletebtn=new Button("删除");





    public void refreshBtnColor(Color whiteBtnColor,Color blackBtnColor,Color deleteBtnColor){
        whitebtn.setBackground(whiteBtnColor);
        blackbtn.setBackground(blackBtnColor);
        deletebtn.setBackground(deleteBtnColor);
    }


    public void init() throws Exception{
        //组装视图，编写逻辑
        whitebtn.addActionListener(e -> {
            //修改标志为1
            board_type=1;
            //刷新按钮颜色
            refreshBtnColor(Color.GREEN,Color.GRAY,Color.GRAY);
        });
        blackbtn.addActionListener(e -> {
            //修改标志为2
            board_type=2;
            //刷新按钮颜色
            refreshBtnColor(Color.GRAY,Color.GREEN,Color.GRAY);
        });
        deletebtn.addActionListener(e -> {
            //修改标志为0
            board_type=0;
            //刷新按钮颜色
            refreshBtnColor(Color.GRAY,Color.GRAY,Color.GREEN);
        });
        p.add(whitebtn);
        p.add(blackbtn);
        p.add(deletebtn);

        frame.add(p,BorderLayout.SOUTH);

        //给棋盘组件初始化
        table= ImageIO.read(new File("src//img//board.jpg"));
        white= ImageIO.read(new File("src//img//white.gif"));
        black= ImageIO.read(new File("src//img//black.gif"));
        selected= ImageIO.read(new File("src//img//selected.gif"));

        //鼠标移动
        chessBoard.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                selected_X =((e.getX()-X_OFFSET)/RATE);
                selected_Y =((e.getY()-Y_OFFSET)/RATE);

                chessBoard.repaint();
            }
        });


        //鼠标点击
        chessBoard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 int xPos= ((e.getX()-X_OFFSET)/RATE);
                 int yPos= ((e.getY()-Y_OFFSET)/RATE);

                 board[xPos][yPos]=board_type;
                 chessBoard.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                selected_X=-1;
                selected_Y=-1;

                chessBoard.repaint();
            }
        });
        //组装棋盘
        chessBoard.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        frame.add(chessBoard);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)throws Exception {
        new GAMEwuziqiyouxi().init();
    }
}
