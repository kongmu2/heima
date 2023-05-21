package io;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class bufferTEST {
    public static void main(String[] args) {
        try (
                BufferedReader in=new BufferedReader(new FileReader("src//word.txt"));

                BufferedWriter os=new BufferedWriter(new FileWriter("src//newword.txt"));
                ){

            List<String > list=new ArrayList<>();
            String line;
            while ((line=in.readLine())!=null){
                    list.add(line);
            }
            //普通sort方法
//            Collections.sort(list);

            //自定义规则
            List<String> sizes=new ArrayList<>();
            Collections.addAll(sizes, "一","二","三","四","五","六","七","八","九");
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {

                    return sizes.indexOf(o1.substring(0,o1.indexOf(".")))-sizes.indexOf(o2.substring(0,o2.indexOf(".")));
                }
            });

            System.out.println(list);


            for (String lists : list) {
                os.write(lists);
                os.newLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
