package ee.itcollege.lug.clock_mechanism;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class ClockMechanism {

    private long getTime() {

        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));

        //TODO RETURN
    }
}
