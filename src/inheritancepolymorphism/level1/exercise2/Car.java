package inheritancepolymorphism.level1.exercise2;

public class Car {

    private static final String BRAND = "Volvo";
    private static String model = "XYZ123";
    private final int power;

    //Static block
    static {
        System.out.println("Class Car was loaded.");
    }

    public Car(int power) {
        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

}

