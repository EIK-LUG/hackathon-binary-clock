package ee.itcollege.lug.display;

import ee.itcollege.lug.data_types.TimeWrapper;

/**
 * Created by jjoeleht on 22.11.14.
 */
public abstract class Display implements DisplayInterface {

    protected int[][] display;

    public Display() {
        this.display = new int[6][4];
    }

    @Override
    public void setTime(TimeWrapper time) {
        columnState(0, time.getHoursTens());
        columnState(1, time.getHoursOnes());
        columnState(2, time.getMinutesTens());
        columnState(3, time.getMinutesOnes());
        columnState(4, time.getSecondsTens());
        columnState(5, time.getSecondsOnes());
        displayTime();
    }

    protected abstract void displayTime();

    public void columnState(int column, int[] arr) {
        display[column] = arr;
    }
    
    

}
