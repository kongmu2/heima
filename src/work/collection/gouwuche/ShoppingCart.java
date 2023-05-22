package work.collection.gouwuche;

import java.util.*;

public class ShoppingCart {
    private Map<Integer, Integer> items; //购物车中的商品，每个商品用ID表示，数量用整数表示

    //构造函数
    public ShoppingCart() {
        items = new HashMap<>();
    }

    //添加商品到购物车
    public void addItem(int itemId, int quantity) {
        if (items.containsKey(itemId)) {
            //如果该商品已经存在于购物车中，则增加其数量
            int oldQuantity = items.get(itemId);
            items.put(itemId, oldQuantity + quantity);
        } else {
            //如果该商品还不存在于购物车中，则将其添加入购物车
            items.put(itemId, quantity);
        }
    }

    //删除指定商品
    public void removeItem(int itemId) {
        items.remove(itemId);
    }

    //修改商品数量
    public void modifyQuantity(int itemId, int newQuantity) {
        items.put(itemId, newQuantity);
    }

    //获取购买商品的总价
    public double getTotalPrice(Map<Integer, Double> itemPrices) {
        double totalPrice = 0.0;
        for (int itemId : items.keySet()) {
            if (itemPrices.containsKey(itemId)) {
                double itemPrice = itemPrices.get(itemId);
                int quantity = items.get(itemId);
                totalPrice += itemPrice * quantity;
            }
        }
        return totalPrice;
    }

    //按购买商品的总价进行升序显示
    public void displayItemsSorted(Map<Integer, String> itemNames, Map<Integer, Double> itemPrices) {
        List<Map.Entry<Integer, Integer>> itemList = new ArrayList<>(items.entrySet());
        itemList.sort((item1, item2) -> {
            double price1 = itemPrices.getOrDefault(item1.getKey(), 0.0) * item1.getValue();
            double price2 = itemPrices.getOrDefault(item2.getKey(), 0.0) * item2.getValue();
            return Double.compare(price1, price2);
        });

        System.out.println("购物车中的商品信息：");
        for (Map.Entry<Integer, Integer> item : itemList) {
            int itemId = item.getKey();
            String itemName = itemNames.getOrDefault(itemId, "[未知商品]");
            double itemPrice = itemPrices.getOrDefault(itemId, 0.0);
            int quantity = item.getValue();
            System.out.println(String.format("%s（单价%.2f元，数量%d个）", itemName, itemPrice, quantity));
        }
    }
}