public class NextDay {


    public static final String CONCATERNATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day = dayTest + 1;
        String result = day+ CONCATERNATION +monthTest+CONCATERNATION+yearTest;
        return result;
    }
}

