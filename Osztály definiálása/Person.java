public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public void printPerson() {
        System.out.println("Vezetéknév: " + lastName);
        System.out.println("Utónév: " + firstName);
        System.out.println("Születési idő: " + birthYear + "." + String.format("%02d", birthMonth) + "." + String.format("%02d", birthDay));
    }

    // Getterek
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    // Setterek
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Frigyes", "Nagy", 1998, 1, 24);

        System.out.println("Első példány adatai:");
        person1.printPerson();

        Person person2 = new Person("John", "Doe");

        person2.setBirthYear(2000);
        person2.setBirthMonth(5);
        person2.setBirthDay(15);

        System.out.println("\nMásodik példány adatai:");
        person2.printPerson();

        person2.setFirstName("Jane");
        person2.setLastName("Doe");

        System.out.println("\nMódosított második példány adatai:");
        person2.printPerson();

    }
}
