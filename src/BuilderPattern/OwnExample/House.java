package BuilderPattern.OwnExample;

public class House {
    private int BHK;
    private int squareFeet;
    private boolean compound;
    private boolean furnished;
    private int parking;

    private boolean garden;
    private boolean swimmingPool;
    private boolean theatre;

    public House(HouseBuilder houseBuilder){
        this.BHK = houseBuilder.BHK;
        this.squareFeet = houseBuilder.squareFeet;
        this.compound = houseBuilder.compound;
        this.furnished = houseBuilder.furnished;
        this.parking = houseBuilder.parking;
        this.garden = houseBuilder.garden;
        this.swimmingPool = houseBuilder.swimmingPool;
        this.theatre = houseBuilder.theatre;
    }

    @Override
    public String toString() {
        return "House Details: " +
                "\nBHK: " + BHK +
                "\nSquare Feet: " + squareFeet +
                "\nCompound: " + compound +
                "\nFurnished: " + furnished +
                "\nParking: " + parking +
                "\nGarden: " + garden +
                "\nSwimming Pool: " + swimmingPool +
                "\nHome Theatre: " + theatre+
                "\n-----------";
    }
}
