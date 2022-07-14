public class NextDay {


    public static final String CONCATERNATION = "/";
    public static final int STARTOFMONTH = 1;

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day;
        int lastOfMonth;
        lastOfMonth = getLastOfMonth(monthTest);
        if (dayTest == lastOfMonth) {
            day = STARTOFMONTH;
            monthTest++;
        } else {
            day = dayTest + 1;
        }
        String result = day + CONCATERNATION + monthTest + CONCATERNATION + yearTest;
        return result;
    }

    private static int getLastOfMonth(int monthTest) {
//        int year = 2020;
        int lastOfMonth;
        switch (monthTest) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                lastOfMonth=31;
                break;
            case 2:
                lastOfMonth=28;
//                if (year == 2020) {
//                    lastOfMonth=29;
//                }else {
//                    lastOfMonth = 28;
//                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth=30;
                break;
            default:
                lastOfMonth=31;
        }
        return lastOfMonth;
    }
}

