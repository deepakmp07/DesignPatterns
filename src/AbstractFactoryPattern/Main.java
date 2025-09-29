package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        MealFactory northIndianMeal = new NorthIndianFoodFactory();
        Starter northIndianStarter = northIndianMeal.starters();
        MainDish northIndianMainDish = northIndianMeal.mainDish();
        Desserts northIndianDesserts = northIndianMeal.desserts();

        northIndianStarter.createStarter();
        northIndianMainDish.createMainDish();
        northIndianDesserts.createDessert();

        System.out.println("------------------------------");
        MealFactory southIndianMeal = new SouthIndiaFoodFactory();
        Starter southIndianStarter = southIndianMeal.starters();
        MainDish southIndianMainDish = southIndianMeal.mainDish();
        Desserts southIndianDesserts = southIndianMeal.desserts();

        southIndianStarter.createStarter();
        southIndianMainDish.createMainDish();
        southIndianDesserts.createDessert();

    }
}
