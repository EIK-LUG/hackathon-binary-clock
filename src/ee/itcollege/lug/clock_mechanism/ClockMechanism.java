package ee.itcollege.lug.clock_mechanism;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class ClockMechanism {



    private String getTime() {

        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return  sdf.format(cal.getTime());

    }
}
