package Musicplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class musicplayer {

    public static final String BGM = "bg.wav";//bgm文件路径
    static Clip music = null; //声明Clip接口
    static File sourceFile = null; //声明文件变量

    /**
     * 音乐播放方法
     */
    public static void playMusic(String path){
        try {
            music = AudioSystem.getClip(); // 获取可用于播放音频文件或音频流的数据流
            sourceFile = new File(path);//获取文件
            AudioInputStream ais = AudioSystem.getAudioInputStream(sourceFile);//获得指示格式的音频输入流
            music.open(ais); //打开数据流
            music.start();
//            music.loop(Clip.LOOP_CONTINUOUSLY);    //开始播放音乐

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 关闭音乐
     */
    public void loop(){
        music.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public static void closeMusic(){
        if (music!=null)    //需要判断music是否为null，避免出现空指针异常
            music.stop();//暂停音乐
    }


    public static void main(String[] args) {
        musicplayer m=new musicplayer();
        m.playMusic(musicplayer.BGM); //调用自定义函数播放音乐
        m.loop();

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("输入0停止音乐");
            if (scan.nextInt() == 0) {
                closeMusic();    //调用自定义方法关闭音乐
                break;
            }
        }
    }
}
