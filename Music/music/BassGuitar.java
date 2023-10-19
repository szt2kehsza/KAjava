package music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        this.numberOfStrings = 4;
        this.name = "Bass Guitar";
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a " + numberOfStrings + "-stringed instrument, making a sound like " + name);
        sound();
    }
}
