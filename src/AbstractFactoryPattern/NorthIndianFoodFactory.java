package AbstractFactoryPattern;

public class NorthIndianFoodFactory implements MealFactory{
    @Override
    public Starter starters() {
        return new NorthIndianStarter();
    }

    @Override
    public MainDish mainDish() {
        return new NorthIndianMainDish();
    }

    @Override
    public Desserts desserts() {
        return new NorthIndianDesserts();
    }
}
