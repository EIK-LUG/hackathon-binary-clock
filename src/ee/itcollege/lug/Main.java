package ee.itcollege.lug;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;

public class Main {

    public static void main(String[] args) {
        ClockMechanism test = new ClockMechanism();


        while (true) {
            try {
                Thread.sleep(1000);
                test.tick();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
