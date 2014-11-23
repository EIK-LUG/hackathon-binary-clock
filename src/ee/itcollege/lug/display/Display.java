package ee.itcollege.lug.display;

/**
 * Created by jjoeleht on 22.11.14.
 */
public abstract class Display implements DisplayInterface {

    protected int[][] display;

    public Display() {
        this.display = new int[6][4];
    }

    public void columnState(int column, int[] arr) {
        display[column] = arr;
    }

}
