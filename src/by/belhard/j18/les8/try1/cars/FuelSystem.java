package by.belhard.j18.les8.try1.cars;

import by.belhard.j18.les8.try1.exceptions.InvalidFuelParameterException;

public class FuelSystem {

    private final FuelType type;

    private final int maxValue;

    private  int currentValue;

    private FuelSystem fuelSystem;

    public FuelSystem(FuelType type, int maxValue, int currentValue) {
        this.type = type;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public FuelType getType() {
        return type;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int fillFuel(int newValue){

        if (newValue <= 0 )throw new InvalidFuelParameterException("Прости но ты дебил? Льешь 0 или минус");

        if (maxValue > currentValue + newValue){
            int rest = newValue - (maxValue - currentValue);
            currentValue = maxValue;
            return rest;
        } else {
            currentValue += newValue;
            return 0;
        }


    }
    public void burnFuel(int value){

        if (value <= 0 ) throw new InvalidFuelParameterException("Да ты стебешь? Как мы сожжем тебе 0 или наколдуем топлива");



    }
}
