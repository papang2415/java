package bankingsystem;

public class MyDate {

    private int date;
    private int month;
    private int year;
    private static final String[] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    //create constructors and overload them
    //create your neccesary setters and getters
    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static String[] getMonthName() {
        return monthName;
    }

    public MyDate() {
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    /* void displayDate() {
        // MAR-01-2021
        System.out.printf("\n%s-%d-%d\n", monthName[month], date, year);
    }*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(monthName[month]);
        sb.append("-");
        sb.append(date);
        sb.append("-");
        sb.append(year);

        return sb.toString();
    }
}
