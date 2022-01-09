/**
 *
 */
public class Trigonometry {
    /**
     *
     * @param radian
     * @return
     */
    public float sinRadian(float radian){
        return  radian * (float) (3.14/180);
    }

    /**
     *
     * @param degree
     * @return
     */
    public float sinDegree(int degree){
       return 0;
    }

    /**
     *
     * @param radian
     * @return
     */
    public float cosRadian(float radian){
        return  0;
    }

    /**
     *
     * @param degree
     * @return
     */
    public float cosDegree(int degree){
        return 0;
    }

    /**
     *
     * @param radian
     * @return
     */
    public float tanRadian(float radian){
        return 0;
    }

    /**
     *
     * @param degree
     * @return
     */
    public float tanDegree(int degree){
        return 0;
    }

    /**
     *
     * @param x
     * @return
     */
    public long square2(long x){

        return x * x;
    }

    /**
     *
     * @param x
     * @return
     */
    public double square2(double x){

        return x * x;
    }

    /**
     *
     * @param x
     * @return
     */
    public long square3(long x){
        return x*(x*x);
    }

    /**
     *
     * @param x
     * @return
     */
    public double square3(double x){
        return 0;
    }

    /**
     *
     * @param d2r
     * @return
     */
    public double Degree2Radian(double d2r){
        return d2r * (3.14/180);
    }
}
