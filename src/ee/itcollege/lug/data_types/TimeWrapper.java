package ee.itcollege.lug.data_types;

import ee.itcollege.lug.clock_mechanism.ClockMechanism;

/**
 * Created by chuck-norris on 22.11.14.
 */
public class TimeWrapper extends DisplayState {

    public TimeWrapper(String time){
        super(timeToRepresentation(time)); //DisplatState()


    }


    private static int[] strToIntARR(String time){
        int[] anArray = new int[6];
        int j = 0;
        for (int i=0;i<time.length();i++) {
             try {
                 anArray[j]=Integer.parseInt(""+time.charAt(i));
                 j++;
             }catch (NumberFormatException e){
             }
         }


        return anArray;
    }

    private static int[][] timeToRepresentation(String time) {
        int[][] matrix = new int[6][4];
        int j=0;
        for (int digit : strToIntARR(time)){

            matrix[j]=intToBinArr(digit);
            j++;
        }


        return matrix;
    }
    private static int[] intToBinArr(int x) {
        int[] repr = {0, 0, 0, 0};
        if (x >= 8) {
            repr[0] = 1;
            x -= 8;
        } if (x >= 4) {
            repr[1] = 1;
            x -= 4;
        } if (x >= 2) {
            repr[2] = 1;
            x -= 2;
        } if (x >= 1) {
            repr[3] = 1;
            x -= 1;
        }
        return repr;
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

    public String toString() {
        for (int i=0;i<6;i++) {
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print(repStorage[i][j]);
            }
        }
        return "";
    }
}
