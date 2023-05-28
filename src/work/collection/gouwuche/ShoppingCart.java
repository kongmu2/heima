package work.collection.gouwuche;

import java.util.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Map<String, CartItem> items = new HashMap<>();

    public ShoppingCart(){
        items.put("1",new CartItem("1","iphone13",3400,0));
        items.put("2",new CartItem("2","vivo",2000,0));
        items.put("3",new CartItem("3","huawei",5000,0));
    }

    // 添加商品到购物车（输入商品的编号和数量）
    public void addItem(String id, int quantity) {
        CartItem item = items.get(id);
        if (item == null) {
            System.out.println("购物车中添加新商品：" + id);
            items.put(id, new CartItem(id, "商品" + id, 10.0, quantity));
        } else {
            System.out.println("购物车中添加商品数量：" + id + " + " + quantity);
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    // 删除商品（删除购物车中的指定购物项）
    public void removeItem(String id) {
        CartItem item = items.get(id);
        if (item != null) {
            System.out.println("购物车中删除商品：" + item);
            items.remove(id);
        }
    }

    // 修改商品（修改商品的数量）
    public void updateItem(String id, int quantity) {
        CartItem item = items.get(id);
        if (item != null) {
            System.out.println("购物车中修改商品数量：" + item.getId() + " => " + quantity);
            item.setQuantity(quantity);
        }
    }

    // 显示所购买的商品信息（按购买商品的总价进行升序显示）
    public void showItems() {
        List<CartItem> itemList = new ArrayList<>(items.values());
        itemList.sort(Comparator.comparingDouble(CartItem::getTotalPrice));
        System.out.println("购物车中的商品信息：");
        for (CartItem item : itemList) {
            System.out.println(item);
        }
    }
}