package ee.itcollege.lug.clock_mechanism;


import ee.itcollege.lug.data_types.TimeWrapper;
import ee.itcollege.lug.display.Display;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class ClockMechanism {

    Display display;

    public ClockMechanism(Display display) {
        this.display = display;
    }



    private String getTime() {

        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return  sdf.format(cal.getTime());

    }

    public void tick() {
        String currentTime = getTime();
        TimeWrapper tw = new TimeWrapper(currentTime);
        display.setTime(tw);
    }
}
