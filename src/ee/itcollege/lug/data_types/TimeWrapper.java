package ee.itcollege.lug.data_types;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class TimeWrapper extends DisplayState {

    public TimeWrapper(int[][] time){
        super(time); //DisplatState()


    }

    private int[] intToBinArr(int x) {
        int[] repr = {0, 0, 0, 0};
        if (x >= 8) {
            repr[0] = 1;
            x =- 8;
        } else if (x >= 4) {
            repr[0] = 1;
            x =- 4;
        } else if (x >= 2) {
            repr[0] = 1;
            x =- 2;
        } else if (x >= 1) {
            repr[0] = 1;
            x =- 1;
        }
        return repr;
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
