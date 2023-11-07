package ch10.ex03_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        Object[] groceryArray2= new GroceryItem[3];
        groceryArray2[0] = new GroceryItem("milk");
        groceryArray2[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray2[2] = new GroceryItem("5 oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray2));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.add(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);

    }
}
