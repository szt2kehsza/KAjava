package music;

public class Main {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        electricGuitar.play();
        bassGuitar.play();
        violin.play();
    }
}
