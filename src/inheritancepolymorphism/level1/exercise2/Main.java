package inheritancepolymorphism.level1.exercise2;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(200);
        Car c2 = new Car(150);

        //Playing around with static attributes
        System.out.println("Car 1 is model: " + c1.getModel());
        c2.setModel("321ZYX");
        System.out.println("Car 1 is model: " + c1.getModel());

        Car.brake();
        c1.accelerate();
    }

}