package kopiowanie.zad19;

public class Car implements Cloneable{

    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) throws CloneNotSupportedException {
        this.make = make;
        this.model = model;
        this.engine = engine!= null ? engine.clone() : new Engine(0,0, "");
    }

    public Engine getEngine() throws CloneNotSupportedException {
        return engine.clone();
    }

    @Override
    public Car clone() throws CloneNotSupportedException{
        Car temp = (Car) super.clone();
        temp.engine = this.engine.clone();
        return temp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
