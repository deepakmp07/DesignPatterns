package AbstractFactoryPattern;

public class NorthIndianStarter implements Starter{

    @Override
    public void createStarter() {
        System.out.println("Paneer Tikka");
    }
}
