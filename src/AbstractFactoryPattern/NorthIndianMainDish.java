package AbstractFactoryPattern;

public class NorthIndianMainDish implements MainDish{

    @Override
    public void createMainDish() {
        System.out.println("Butter Chicken");
    }
}
