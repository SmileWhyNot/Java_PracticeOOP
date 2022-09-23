package VehicleTypes;

import Interfaces.Vehicle;
import Interfaces.Object;

public class Truck extends Car implements Vehicle, Object{
    private float LoadCapacity;
    private String BodyType;
    public Truck(){
        super();
        LoadCapacity = 0;
        BodyType = "Undefined";
    }
    public Truck(String CarBrand, String EngineType, float Mileage){
        super(CarBrand, EngineType, Mileage);
        LoadCapacity = 0;
        BodyType = "Undefined";
    }
    public Truck(String CarBrand, String EngineType, int EnginePower, float Weight,
                 float Mileage, float LoadCapacity, String BodyType){
        super(CarBrand, EngineType, EnginePower, Weight, Mileage);
        this.LoadCapacity = LoadCapacity;
        this.BodyType = BodyType;
    }
    public float getLoadCapacity() {
        return LoadCapacity;
    }
    public String getBodyType() {
        return BodyType;
    }
    public String Brand() {
        String str = "Марка грузовика: " + this.CarBrand;
        if (this.CarBrand != "Undefined") { str+= " для дальних грузоперевозок"; }
        return str;
    }
    public void Print(){
        System.out.println("\n" + this.Brand() + "\nТип двигателя: " + this.getEngineType()
                + "\nМощность двигателя: " + this.getEnginePower() + "лс\nВес авто: " + this.getWeight()
                + "тонн \nПробег: " + this.getMileage() + "км\nГрузоподъемность: "
                + this.getLoadCapacity() + "тонн \nТип кузова: "
                + this.BodyType);
    }
}