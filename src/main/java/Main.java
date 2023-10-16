
public class Main {
    public static void main(String[] args) {
        Utils.check(1, 1, 1);
        Utils.check(-1, 1, 2);
        Utils.check(-1, 3, -9);
        Utils.check(-1, -5, -10);

        Utils.checkDayAndMonthIsHoliday(0, 0);
        Utils.checkDayAndMonthIsHoliday(31, 1);
        Utils.checkDayAndMonthIsHoliday(32, 1);
        Utils.checkDayAndMonthIsHoliday(30, 4);
        Utils.checkDayAndMonthIsHoliday(-1, 3);
        Utils.checkDayAndMonthIsHoliday(31, 2);
        Utils.checkDayAndMonthIsHoliday(3, 7);


    }
}