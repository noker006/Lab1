package com.grsu.model;

public class MiniBus extends Car {

    private MiniBusType function;

    public MiniBus() { }

    public MiniBusType getFunction() {
        return function;
    }

    public void setFunction(MiniBusType function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MiniBus miniBus = (MiniBus) o;
        if (function != miniBus.function) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (function.equals(MiniBusType.PASSENGER)? 2: function.equals(MiniBusType.CARGO)? 1 : 0);
    }

    @Override
    public String toString() {
        return "MiniBus"+
                "{function='" + function + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}