package Date;
public class MainDate {
    public static void main(String[] args) {
        Date date = new Date(3, 9, 2023);
        date.displayDate();
        date.setMonth(4);
        date.setDay(1);
        date.setYear(2024);
        date.displayDate();
    }
}
