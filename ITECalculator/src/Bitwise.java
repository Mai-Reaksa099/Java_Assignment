public class Bitwise {

    public int AND(int value1, int value2){
        return value1 & value2;
    }
    public int OR(int value1, int value2){
        return value1 | value2;
    }
    public int OXR(int value1, int value2){
        return value1 ^ value2;
    }
    public int LiftShift(int value1, int value2){
        return value1 >> value2;
    }
    public int RightShift(int value1, int value2){
        return  value1 << value2;
    }
    public int BitInversion(int val1){
        return ~ val1;
    }
}
