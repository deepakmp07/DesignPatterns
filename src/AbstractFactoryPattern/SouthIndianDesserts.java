package AbstractFactoryPattern;

public class SouthIndianDesserts implements Desserts{
    @Override
    public void createDessert() {
        System.out.println("Payasam");
    }
}
