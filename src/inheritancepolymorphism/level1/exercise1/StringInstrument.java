package inheritancepolymorphism.level1.exercise1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }

    @Override
    public String toString() {
        return "StringInstrument{}";
    }

}
