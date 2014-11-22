package ee.itcollege.lug;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;

public class Main {

    public static void main(String[] args) {
        ClockMechanism test = new ClockMechanism();
        System.out.print(test.getTime());
    }
}
