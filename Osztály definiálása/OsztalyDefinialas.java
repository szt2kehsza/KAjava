class Person {
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
}

class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isCorrectDate() {
        if (1 <= month && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return (1 <= day && day <= 31);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return (1 <= day && day <= 30);
            } else {
                // Február esetén szökőév ellenőrzése
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return (1 <= day && day <= 29);
                } else {
                    return (1 <= day && day <= 28);
                }
            }
        }
        return false;
    }

    public void printDate() {
        System.out.println("Dátum: " + year + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }

    // Getterek
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Setterek
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    public void printAnimal() {
        System.out.println("Állat neve: " + name);
        System.out.println("Lábak száma: " + numberOfLegs);
        System.out.println("Szemek száma: " + numberOfEyes);
    }

    // Getterek
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public String getName() {
        return name;
    }

    // Setterek
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setName(String name) {
        this.name = name;
    }
}