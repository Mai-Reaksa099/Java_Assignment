public class MoneyExchange {

    public double Rail2Dolor(int rail){
        return (double) rail * 4050;
    }
    public double Rail2Euro(int rail){
        return rail * 0.00022;
    }
    public double Rail2Frank(int rail){
        return rail * 6000;
    }
    public double Rail2Pound(int rail){
        return  rail * 6050;
    }
    public double Rail2Bart(int rail){

        return rail *100;
    }
    public double Dolor2Rail(double dolor){
        return  dolor / 4050;
    }
    public double Euro2Rail(double euro){

        return euro / 0.00022;
    }
    public double Frank2Rail(double frank){

        return  frank / 6000;
    }
    public double Pound2Rail(double pound){
        return pound / 6050;
    }
    public double Bart2Rail(double bart){
        return bart / 100;
    }
}
