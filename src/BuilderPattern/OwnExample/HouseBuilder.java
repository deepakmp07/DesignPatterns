package BuilderPattern.OwnExample;

public class HouseBuilder {
    public int BHK;
    public int squareFeet;
    public boolean compound;
    public boolean furnished;
    public int parking;

    public boolean garden;
    public boolean swimmingPool;
    public boolean theatre;

    public HouseBuilder(int BHK, int squareFeet, boolean compound, boolean furnished, int parking){
        this.BHK = BHK;
        this.squareFeet = squareFeet;
        this.compound = compound;
        this.furnished = furnished;
        this.parking = parking;
    }

    public HouseBuilder WithGarden(boolean garden){
        this.garden = garden;
        return this;
    }

    public HouseBuilder WithSwimmingPool(boolean pool){
        this.swimmingPool = pool;
        return this;
    }

    public HouseBuilder WithHomeTheatre(boolean theatre){
        this.theatre = theatre;
        return this;
    }

    public House build(){
        return new House(this);
    }
}
