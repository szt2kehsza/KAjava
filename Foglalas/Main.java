import java.util.Random;

interface Reservation {
    String getReservationCode();
    String getDayOfWeek();
}

class Booking implements Reservation {
    private String code;
    private String dayOfWeek;

    public Booking() {
        this.code = generateReservationCode();
        this.dayOfWeek = getRandomDayOfWeek();
    }

    private String generateReservationCode() {
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder codeBuilder = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            codeBuilder.append(characters.charAt(random.nextInt(characters.length())));
        }
        return codeBuilder.toString();
    }

    private String getRandomDayOfWeek() {
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Random random = new Random();
        return daysOfWeek[random.nextInt(daysOfWeek.length)];
    }

    @Override
    public String getReservationCode() {
        return code;
    }

    @Override
    public String getDayOfWeek() {
        return dayOfWeek;
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Reservation reservation = new Booking();
            System.out.printf("Booking# %s for %s%n", reservation.getReservationCode(), reservation.getDayOfWeek());
        }
    }
}
