/**
 *
 */
public class Bitwise {
    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public int AND(int value1, int value2){
        return value1 & value2;
    }

    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public int OR(int value1, int value2){
        return value1 | value2;
    }

    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public int OXR(int value1, int value2){
        return value1 ^ value2;
    }

    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public int LiftShift(int value1, int value2){
        return value1 >> value2;
    }

    /**
     *
     * @param value1
     * @param value2
     * @return
     */
    public int RightShift(int value1, int value2){
        return  value1 << value2;
    }

    /**
     *
     * @param val1
     * @return
     */
    public int BitInversion(int val1){
        return ~ val1;
    }
}
