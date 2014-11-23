package ee.itcollege.lug.data_types;

/**
 * Created by aleksandr_babykin on 22.11.14.
 */
public class DisplayState {

    protected int[][] repStorage;

    public DisplayState(int[][] representation) {
        this.repStorage = representation;
    }

    public int[] getColumn(int columnNr) {
        return repStorage[columnNr];
    }

    public void setState(int[][] representation) {
        this.repStorage = representation;
    }

}
