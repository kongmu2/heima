package AWT;

import javax.swing.*;
import java.awt.*;

public class AWTapi {
    Frame frame=new Frame("测试组件");

    TextArea ta=new TextArea(10,10);

    Choice color=new Choice();

    CheckboxGroup groups=new CheckboxGroup();
    Checkbox male=new Checkbox("男",groups,true);
    Checkbox female=new Checkbox("女",groups,false);

    Checkbox ismarry=new Checkbox("是否已婚");

    TextField t=new TextField(30);
    Button ok=new Button("确认");


    List colorlist=new List(6,true);



    public void init(){

        Box bBox=Box.createHorizontalBox();
        bBox.add(t);
        bBox.add(ok);

        frame.add(bBox,BorderLayout.SOUTH);


        color.add("红色");
        color.add("绿色");
        color.add("蓝色");
        Box cBox=Box.createHorizontalBox();
        cBox.add(color);
        cBox.add(male);
        cBox.add(female);
        cBox.add(ismarry);

        Box topleft=Box.createVerticalBox();
        topleft.add(ta);
        topleft.add(cBox);




        colorlist.add("红色");
        colorlist.add("绿色");
        colorlist.add("蓝色");
        Box top=Box.createHorizontalBox();
        top.add(topleft);
        top.add(colorlist);


        frame.add(top);

        frame.pack();
        frame.setVisible(true);


    }



    public static void main(String[] args) {
        new AWTapi().init();
    }
}
