package music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.numberOfStrings = 4;
        this.name = "Violin";
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a " + numberOfStrings + "-stringed instrument, making a sound like " + name);
        sound();
    }
}
