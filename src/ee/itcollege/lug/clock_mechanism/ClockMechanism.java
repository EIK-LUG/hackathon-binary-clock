package ee.itcollege.lug.clock_mechanism;


import ee.itcollege.lug.display.DisplayInterface;
import ee.itcollege.lug.display.cli.CLIDisplay;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class ClockMechanism {
    private DisplayInterface display = new CLIDisplay();

    public long getTime() {
        return 1;
    }

    public void tick() {

    }
}
