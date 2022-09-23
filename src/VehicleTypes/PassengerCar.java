package VehicleTypes;

import Interfaces.Object;
import Interfaces.Vehicle;

public abstract class PassengerCar extends Car implements Vehicle, Object {
    protected float FuelConsumption;
    protected float AccelerationTime;
    public PassengerCar() {
        super();
        FuelConsumption = 0;
        AccelerationTime = 0;
    }
    public PassengerCar(String CarBrand, String EngineType, float Mileage){
        super(CarBrand, EngineType, Mileage);
        FuelConsumption = 0;
        AccelerationTime = 0;
    }
    public PassengerCar(String carBrand, String engineType, int enginePower, float weight, float mileage) {
        super(carBrand, engineType, enginePower, weight, mileage);
    }
    public float getAccelerationTime() {
        return AccelerationTime;
    }
    public float getFuelConsumption() {
        return FuelConsumption;
    }
    public String Brand() {
        String str = "Марка автомобиля: " + this.CarBrand;
        if (this.CarBrand != "Undefined") { str+=  " (Семейный автомобиль)"; }
        return str;
    }
}
