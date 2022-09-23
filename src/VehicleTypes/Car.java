package VehicleTypes;

public abstract class Car {
    protected String CarBrand;
    protected String EngineType; // diesel // carburetor
    protected int EnginePower;
    protected float Weight;
    protected float Mileage; // пробег
    public String getCarBrand() { return CarBrand; }
    public String getEngineType() { return EngineType; }
    public int getEnginePower() { return EnginePower; }
    public float getWeight() { return Weight; }
    public float getMileage() { return Mileage; }
    protected Car(){
        CarBrand = "Undefined";
        EngineType = "Undefined";
        EnginePower = 0;
        Weight = 0;
        Mileage = 0;
    }
    protected Car(String CarBrand, String EngineType, float Mileage){
        EnginePower = 0;
        Weight = 0;
        this.CarBrand = CarBrand;
        this.EngineType = EngineType;
        this.Mileage = Mileage;
    }
    protected Car(String CarBrand, String EngineType, int EnginePower, float Weight, float Mileage){
        this(CarBrand, EngineType, Mileage);
        this.EnginePower = EnginePower;
        this.Weight = Weight;
    }
}