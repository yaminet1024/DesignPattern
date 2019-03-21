package Experience_3_2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItemList = new ArrayList<>();

    public void addMenuItem(MenuItem item){
        menuItemList.add(item);
    }

    public MenuItem getItem(String name){
        for (MenuItem item : menuItemList){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;

    }
}
