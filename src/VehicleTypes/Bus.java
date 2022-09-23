package VehicleTypes;

import Interfaces.Object;
import Interfaces.Vehicle;

public class Bus extends Car implements Vehicle, Object {
    private int PlaceCount;
    public Bus(){
        super();
        PlaceCount = 0;
    }
    public Bus(String CarBrand, String EngineType, float Mileage){
        super(CarBrand, EngineType, Mileage);
        PlaceCount = 0;
    }
    public Bus(String CarBrand, String EngineType, int EnginePower, float Weight,
               float Mileage, int PlaceCount){
        super(CarBrand, EngineType, EnginePower, Weight, Mileage);
        this.PlaceCount = PlaceCount;
    }
    public int getPlaceCount() {
        return PlaceCount;
    }
    public String Brand() {
        String str = "Марка автобуса: " + this.CarBrand;
        if (this.CarBrand != "Undefined") { str += " для дальних экскурсий"; }
        return str;
    }
    public void Print(){
        System.out.println("\n" + this.Brand() + "\nТип двигателя: " + this.getEngineType()
                + "\nМощность двигателя: " + this.getEnginePower() + "лс\nВес авто: " + this.getWeight()
                + "тонн \nПробег: " + this.getMileage() + "км\nКоличество мест: "
                + this.getPlaceCount());
    }
}