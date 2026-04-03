/**
 * Answer to question 1:
 *
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(year);
        setDay(day);
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1975;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0) {
            throw new IllegalArgumentException("Year must be a positive value");
        }
        this.year = year;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
