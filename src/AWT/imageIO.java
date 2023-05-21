package AWT;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class imageIO {
    private Frame frame=new Frame("图片查看器");

    MenuBar menuBar=new MenuBar();
    Menu file=new Menu("文件");
    MenuItem open=new MenuItem("打开");
    MenuItem save=new MenuItem("另存为");


    BufferedImage image;
    private class Mycanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(image,0,0,null);
        }
    }
    Mycanvas drawarea=new Mycanvas();





    public void init()throws Exception {
        //组装视图
        open.addActionListener(e -> {
            FileDialog fileDialog=new FileDialog(frame,"打开文件",FileDialog.LOAD);
            fileDialog.setVisible(true);

            String directory = fileDialog.getDirectory();
            String file = fileDialog.getFile();

            try {
                image =ImageIO.read(new File(directory,file));
                drawarea.repaint();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });
        save.addActionListener(e -> {
            FileDialog fileDialog=new FileDialog(frame,"保存图片",FileDialog.SAVE);
            fileDialog.setVisible(true);

            String directory = fileDialog.getDirectory();
            String file = fileDialog.getFile();

            try {
                ImageIO.write(image,"JPEG",new File(directory,file));
                drawarea.repaint();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });

        file.add(open);
        file.add(save);

        menuBar.add(file);


        frame.setMenuBar(menuBar);

        frame.add(drawarea);


        frame.setBounds(200,200,740,500);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) throws Exception {
            new imageIO().init();
    }
}
