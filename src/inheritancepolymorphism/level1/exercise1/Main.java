package inheritancepolymorphism.level1.exercise1;

public class Main {
    public static void main(String[] args) {

        PercussionInstrument drums = new PercussionInstrument("Drums", 80);
        StringInstrument violin = new StringInstrument("Violin", 65);
        WindInstrument flute = new WindInstrument("Flute", 25);

        drums.play();
        violin.play();
        flute.play();

        Instrument.testingStaticBlock();
    }

}