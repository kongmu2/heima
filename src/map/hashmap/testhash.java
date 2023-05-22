package map.hashmap;

import org.junit.Test;

import java.util.*;

public class testhash {
    @Test
    public void test(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CN","中华人民共和国");
        hashMap.put("RU","俄罗斯");
        hashMap.put("US","美丽国");

        System.out.println("hashMap.get(\"CN\") = " + hashMap.get("CN"));
        System.out.println("hashMap.get(\"RU\") = " + hashMap.get("RU"));
        System.out.println("hashMap.containsKey(\"FR\") = " + hashMap.containsKey("FR"));
        System.out.println("hashMap.containsKey(\"CN\") = " + hashMap.containsKey("CN"));
        System.out.println(hashMap.keySet());
        System.out.println("hashMap.values() = " + hashMap.values());

        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s+"="+hashMap.get(s));
        }

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("entry.getKey()+\"=\"+entry.getValue() = " + entry.getKey() + "=" + entry.getValue());
        }

        hashMap.remove("RU");
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap);
    }

    @Test
    public void test2(){
        String[] s={"chenhao","zhangsan","zhangsan","chenhao","lisi","wangwu","zhaoliu","xiaoqiang","haha"};


        HashMap<String, Integer> map = new HashMap<>();
        for (String s1 : s) {
            if (map.containsKey(s1)){
                map.put(s1,map.get(s1)+1);
            }else {
                map.put(s1,1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    @Test
    public void test3(){

        int min = 30;
        int max = 35;
        int total = 50;

        // 随机生成50个30到35的整数
        Random random = new Random();
        int[] nums = new int[total];
        for (int i = 0; i < total; i++) {
            nums[i] = random.nextInt(max - min + 1) + min;
        }

        // 统计每个数字出现的次数
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // 按照数字的降序排列输出
        System.out.println("数字出现次数：");
        for (int num : countMap.descendingKeySet()) {
            System.out.println(num + ": " + countMap.get(num));
        }

        // 统计出现次数最多的数字和它的次数
        int maxNum = -1;
        int maxCount = -1;
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > maxCount) {
                maxNum = num;
                maxCount = count;
            }
        }
        System.out.println("出现次数最多的数字是：" + maxNum + "，出现次数为：" + maxCount);

        }
}
