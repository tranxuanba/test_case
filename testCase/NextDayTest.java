import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("test case 1")
    void testDay1Month1Year2018() {
        //chuan bi du lieu
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;

        String expect = "2/1/2018";
        //chay phuong thuc
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
        //so sanh
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("test case 2")
    void testDay31Month1Year2018() {
        //chuan bi du lieu
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;

        String expect = "1/2/2018";
        //chay phuong thuc
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
        //so sanh
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("test case 3")
    void testDay30Month4Year2018() {
        //chuan bi du lieu
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;

        String expect = "1/5/2018";
        //chay phuong thuc
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
        //so sanh
        assertEquals(expect, result);
    }
}