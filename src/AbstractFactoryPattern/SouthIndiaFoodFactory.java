package AbstractFactoryPattern;

public class SouthIndiaFoodFactory implements MealFactory{
    @Override
    public Starter starters() {
        return new SouthIndianStarter();
    }

    @Override
    public MainDish mainDish() {
        return new SouthIndianMainDish();
    }

    @Override
    public Desserts desserts() {
        return new SouthIndianDesserts();
    }
}
