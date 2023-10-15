package ch08.BillsBurgerChallenge;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
        System.out.println("=".repeat(30));

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();
        System.out.println("=".repeat(30));

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.prinItemizedList();
//        System.out.println("=".repeat(30));
//
//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.prinItemizedList();

        MealOrder delexMeal = new MealOrder("deluxe", "7-up", "chili");
        delexMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        delexMeal.setDrinkSize("SMALL");
        delexMeal.prinItemizedList();
    }


}
