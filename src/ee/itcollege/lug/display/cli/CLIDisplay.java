package ee.itcollege.lug.display.cli;

import ee.itcollege.lug.data_types.DisplayState;
import ee.itcollege.lug.data_types.TimeWrapper;
import ee.itcollege.lug.display.Display;

/**
 * Created by jjoeleht on 22.11.14.
 */
public class CLIDisplay  extends Display {

    @Override
    public void setTime(TimeWrapper time) {
        columnState(0, time.getHoursTens());
        columnState(1, time.getHoursOnes());
        columnState(2, time.getMinutesTens());
        columnState(3, time.getMinutesOnes());
        columnState(4, time.getSecondsTens());
        columnState(5, time.getSecondsOnes());
        printTime();
    }

    private void printTime() {
        System.out.println();
        for (int i=0;i<4;i++) {
            for(int j=0;j<6;j++){
                System.out.print(display[j][i]);
            }
            System.out.println();
        }
    }

    @Override
    public void setState(DisplayState state) {

    }
}
