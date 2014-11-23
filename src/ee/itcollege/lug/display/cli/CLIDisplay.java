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
        int[] arr =  time.getSecondsOnes();
        System.out.println(""+arr[0]+arr[1]+arr[2]+arr[3]);
    }

    @Override
    public void setState(DisplayState state) {

    }
}
