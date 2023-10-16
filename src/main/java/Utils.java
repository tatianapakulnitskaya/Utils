public class Utils {
    public static void check(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0)
            System.out.println("excellent");
        else if ((y > 0 && z > 0) || (x > 0 && y > 0) || (x > 0 && z > 0))
            System.out.println("good");
        else if (y > 0 || x > 0 || z > 0)
            System.out.println("fine");
        else
            System.out.println("bad");
    }

    public static void checkDayAndMonthIsHoliday(int day, int month) {
        switch (month) {
            case 1:
                if (1 <= day && day <= 31 && (day == 1 || day == 7))
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 3:
                if (1 <= day && day <= 31 && day == 8)
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 5:
                if (1 <= day && day <= 31 && (day == 1 || day == 9))
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 7:
                if (1 <= day && day <= 31 && day == 3)
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 8:
                if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
            case 10:
                if (1 <= day && day <= 31 && day == 7)
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 12:
                if (1 <= day && day <= 31 && day == 25)
                    System.out.println("holiday " + day + "/" + month);
                else if (1 <= day && day <= 31)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (1 <= day && day <= 30)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            case 2:
                if (1 <= day && day <= 28)
                    System.out.println("not holiday " + day + "/" + month);
                // else System.out.println("Invalid date " + day + "/" + month);
                break;
            default:
                System.out.println("Something went wrong");
        }
    }
}
