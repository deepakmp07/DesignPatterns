package AbstractFactoryPattern;

public interface MealFactory {
    Starter starters();
    MainDish mainDish();
    Desserts desserts();
}
