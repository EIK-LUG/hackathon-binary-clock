package ee.itcollege.lug.data_types;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class TimeWrapper extends DisplayState {

    public TimeWrapper(int[][] time){
        super(time); //DisplatState()


    }

    private int[][] timeToRepresentation(String time){



       return null;
    }

    public int[] getHourTens() {
        return getColumn(0);
    }

    public int[] getHoursOnes() {
        return getColumn(1);
    }

    public int[] getMinutesTens() {
        return getColumn(2);
    }

    public int[] getMinutesOnes() {
        return getColumn(3);
    }


    public int[] getSecondsTens() {
        return getColumn(4);
    }

    public int[] getSecondsOnes() {
        return getColumn(5);
    }


}
