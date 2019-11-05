package by.belhard.j18.les8.try1.cars;

public abstract class Car {

    private String title;

    private WheelType wheels;

    private FuelSystem fuelSystem;



    public String getTitle() {
        return title;
    }

    public WheelType getWheels() {
        return wheels;
    }

   public int fillFuel(int newValue){

        return fuelSystem.fillFuel(newValue);
    }

}
