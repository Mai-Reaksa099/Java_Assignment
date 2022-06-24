/**
 *
 */
public class MoneyExchange {
    /**
     *
     * @param rail
     * @return
     */
    public double Rail2Dolor(int rail){

        return (double) rail * 4050;
    }

    /**
     *
     * @param rail
     * @return
     */
    public double Rail2Euro(int rail){

        return rail * 0.00022;
    }

    /**
     *
     * @param rail
     * @return
     */
    public double Rail2Frank(int rail){
        return rail * 6000;
    }

    /**
     *
     * @param rail
     * @return
     */
    public double Rail2Pound(int rail){
        return  rail * 6050;
    }

    /**
     *
     * @param rail
     * @return
     */
    public double Rail2Bart(int rail){

        return rail *100;
    }

    /**
     *
     * @param dolor
     * @return
     */
    public double Dolor2Rail(double dolor){
        return  dolor / 4050;
    }

    /**
     *
     * @param euro
     * @return
     */
    public double Euro2Rail(double euro){

        return euro / 0.00022;
    }

    /**
     *
     * @param frank
     * @return
     */
    public double Frank2Rail(double frank){

        return  frank / 6000;
    }

    /**
     *
     * @param pound
     * @return
     */
    public double Pound2Rail(double pound){
        return pound / 6050;
    }

    /**
     *
     * @param bart
     * @return
     */
    public double Bart2Rail(double bart){
        return bart / 100;
    }

}
