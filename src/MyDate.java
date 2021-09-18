/**
 * @author Negin Mousavi
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate nextDay() {
        this.day += 1;
        if (this.month < 7) {
            if (this.day - 1 == 31) {
                this.day = 1;
                this.month += 1;
            }
        } else {
                if (this.day -1 == 30) {
                    this.day = 1;
                    if (this.month == 12) {
                        this.year += 1;
                        this.month = 1;
                    } else
                        this.month += 1;
                }
            }
        return this;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
