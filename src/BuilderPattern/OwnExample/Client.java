package BuilderPattern.OwnExample;

public class Client {
    public static void main(String[] args) {

        House basicHouse = new HouseBuilder(2, 4000, true, false, 2)
                .build();

        System.out.println(basicHouse);

        House luxuryHouse = new HouseBuilder(4, 1000, true, true, 6)
                .WithGarden(true)
                .WithSwimmingPool(true)
                .WithHomeTheatre(true)
                .build();

        System.out.println(luxuryHouse);
    }
}
