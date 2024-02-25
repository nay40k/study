package autopark.transport;

public class Taxi extends Transport {

    private String carClass;

    public Taxi(String model, int fuelConsumption, int price, String carClass) {
        super(model, fuelConsumption, price);
        this.carClass = carClass;
    }
}
