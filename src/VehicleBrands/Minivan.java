package VehicleBrands;

import Interfaces.Object;
import Interfaces.Vehicle;
import VehicleTypes.PassengerCar;

public class Minivan extends PassengerCar implements Vehicle, Object {
    public Minivan() {
        super();
    }
    public Minivan(String CarBrand, String EngineType, float Mileage){
        super(CarBrand, EngineType, Mileage);
    }
    public Minivan(String CarBrand, String EngineType, int EnginePower, float Weight,
                        float Mileage, float FuelConsumption, float AccelerationTime){
        super(CarBrand, EngineType, EnginePower, Weight, Mileage);
        this.FuelConsumption = FuelConsumption;
        this.AccelerationTime = AccelerationTime;
    }
    public String Brand() {
        String str = "Марка автомобиля: Минивен (Семейный автомобиль)";
        this.CarBrand = "Минивен";
        return str;
    }
    public void Print(){
        System.out.println("\n" + this.Brand() + "\nТип двигателя: " + this.getEngineType()
                + "\nМощность двигателя: " + this.getEnginePower() + "лс\nВес авто: " + this.getWeight()
                + "тонн \nПробег: " + this.getMileage() + "км\nВремя разгона до 100км/ч: "
                + this.getAccelerationTime() + "сек\nРасход топлива на 100км: "
                + this.getFuelConsumption() + "л");
    }
}