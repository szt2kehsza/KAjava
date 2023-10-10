public class Date {
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

    public static void main(String[] args) {
        Date date = new Date(2023, 5, 30);
        date.printDate();
    }
}
