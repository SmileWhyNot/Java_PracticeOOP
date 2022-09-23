package MainProg_Var7;

import VehicleBrands.Minivan;
import VehicleBrands.Pickup;
import Mistakes.CatchMistake;
import VehicleTypes.Bus;
import VehicleTypes.Truck;

public class Writer {
    public static void main(String[] args) {
        /*Минивен    Полный конструктор с параметрами*/
        System.out.println("Введите тип двигателя (Карбюраторный/Дизельный): ");
        String engineType = CatchMistake.ReadText();
        if (!engineType.equals("Карбюраторный")  && !engineType.equals("Дизельный")) engineType = "Undefined";
        System.out.println("Введите мощность двигателя: ");
        int enginePower = CatchMistake.ReadPositiveInt();
        System.out.println("Введите вес авто: ");
        float Weight = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите пробег: ");
        float Mileage = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите расход топлива: ");
        float FuelConsumption = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите время разгона до 100 км/ч: ");
        float AccelerationTime = CatchMistake.ReadPositiveFloat();
        Minivan minivan = new Minivan("Мууууивен", engineType, enginePower, Weight, Mileage,
                                         FuelConsumption, AccelerationTime );
        minivan.Print();
        /*Пикап    Конструктор без параметров*/
        Pickup pickup = new Pickup();
        pickup.Print();

        /*Автобус    Полный конструктор с параметрами*/
        System.out.println("\nВведите марку автобуса: ");
        String CarBrand = CatchMistake.ReadText();
        System.out.println("Введите тип двигателя (Карбюраторный/Дизельный): ");
        engineType = CatchMistake.ReadText();
        if (!engineType.equals("Карбюраторный")  && !engineType.equals("Дизельный")) engineType = "Undefined";
        System.out.println("Введите мощность двигателя: ");
        enginePower = CatchMistake.ReadPositiveInt();
        System.out.println("Введите вес авто: ");
        Weight = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите пробег: ");
        Mileage = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите количество мест: ");
        int PlaceCount = CatchMistake.ReadPositiveInt();
        Bus bus = new Bus(CarBrand, engineType, enginePower, Weight, Mileage, PlaceCount );
        bus.Print();

        /*Грузовик    Полный конструктор с параметрами*/
        System.out.println("\nВведите марку грузовика: ");
        CarBrand = CatchMistake.ReadText();
        System.out.println("Введите тип двигателя (Карбюраторный/Дизельный): ");
        engineType = CatchMistake.ReadText();
        if (!engineType.equals("Карбюраторный")  && !engineType.equals("Дизельный")) engineType = "Undefined";
        System.out.println("Введите мощность двигателя: ");
        enginePower = CatchMistake.ReadPositiveInt();
        System.out.println("Введите вес авто: ");
        Weight = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите пробег: ");
        Mileage = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите грузоподъемность грузовика: ");
        float LoadCapacity = CatchMistake.ReadPositiveFloat();
        System.out.println("Введите тип кузова (Открытый/Закрытый): ");
        String BodyType = CatchMistake.ReadText();
        if (!BodyType.equals("Открытый")  && !BodyType.equals("Закрытый")) engineType = "Undefined";
        Truck truck = new Truck(CarBrand, engineType, enginePower, Weight, Mileage, LoadCapacity, BodyType );
        truck.Print();
    }
}