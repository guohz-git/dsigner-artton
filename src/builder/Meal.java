package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 点餐对象
 */
public class Meal {
    //客户选餐列表
    private List<Item> items = new ArrayList<>();

    //增加饮食
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item :items){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for (Item item : items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
