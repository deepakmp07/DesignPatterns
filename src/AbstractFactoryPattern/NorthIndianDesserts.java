package AbstractFactoryPattern;

public class NorthIndianDesserts implements Desserts{
    @Override
    public void createDessert() {
        System.out.println("Gulab Jamun");
    }
}
