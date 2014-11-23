package ee.itcollege.lug;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;
import ee.itcollege.lug.display.Display;
import ee.itcollege.lug.display.cli.CLIDisplay;

public class Main {

    public static void main(String[] args) {
        Display clidisplay = new CLIDisplay();
        ClockMechanism test = new ClockMechanism(clidisplay);

        //Debug
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
