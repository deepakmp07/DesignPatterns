package AbstractFactoryPattern;

public class SouthIndianMainDish implements MainDish{

    @Override
    public void createMainDish() {
        System.out.println("Chettinad Chicken Curry with Parotta");
    }
}
