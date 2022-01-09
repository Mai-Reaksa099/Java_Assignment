/**
 *
 */
import java.util.Scanner;
import java.util.*;
public class MainProgram {
    public static void main(String[] args){
        /**
         *
         */
        int option;

        while (true) {
            System.out.println("========================================");
            System.out.println("1- Arithmetic Program  ");
            System.out.println("2- Trigonometry Program  ");
            System.out.println("3- Bitwise Program  ");
            System.out.println("4- Money Exchange Program  ");
            System.out.println("========================================");

            Arithmetic arithmetic = new Arithmetic();
            MoneyExchange moneyExchange = new MoneyExchange();
            Bitwise bitwise = new Bitwise();
            Trigonometry trigonometry = new Trigonometry();
            Scanner choice = new Scanner((System.in));

            System.out.print("  Please Choice 1->4 ");
            option = choice.nextInt();

            switch (option) {
                /**
                 *
                 */
                case 1:
                    int number1, number2;
                    System.out.println("========================================");
                    System.out.print("Please Enter Number 1 ");
                    number1 = choice.nextInt();
                    System.out.print("Please Enter Number 2 ");
                    number2 = choice.nextInt();

                    System.out.println("================================================");
                    System.out.println("Sum of Number = " + arithmetic.sum(number1, number2));
                    System.out.println("Division of Number = " + arithmetic.divide(number1, number2));
                    System.out.println("Subtraction of Number " + arithmetic.minus(number1, number2));
                    System.out.println("Multiplication of Number " + arithmetic.multiply(number1, number2));
                    System.out.println("Modulus of Number " + arithmetic.modulo(number1, number2));

                    break;
                /**
                 *
                  */
                case 2:
                    double valueInput;
                    System.out.println("========================================");
                    System.out.print("Please Enter Value ");
                    valueInput = choice.nextFloat();
                    System.out.println("================================================");
                    System.out.println("Double Value of " + valueInput + " square 2 is " + trigonometry.square2(valueInput));
                    System.out.println("Long Value of " + valueInput + " square 2 is " + trigonometry.square2(valueInput));
                    System.out.println(valueInput + " degree = " + trigonometry.Degree2Radian(valueInput) + " radian");
                    System.out.println("Value of " + valueInput + " square 3 is " + trigonometry.square3(valueInput));
               break;
                /**
                 *
                 */
                case 3:
                    int input1, input2;
                    System.out.println("========================================");
                    System.out.print("please Input Value 1: ");
                    input1 = choice.nextInt();
                    System.out.print("Please Input Value 2: ");
                    input2 = choice.nextInt();

                    System.out.println("================================================");
                    System.out.println("Bitwise of Inversion " + bitwise.BitInversion(input1));
                    System.out.println("Bitwise of OR " + bitwise.OR(input1,input2));
                    System.out.println("Bitwise of AND " + bitwise.AND(input1, input2));
                    System.out.println("Bitwise of OXR " + bitwise.OXR(input1, input2));
                    System.out.println("Bitwise of Lift to Shift " + bitwise.LiftShift(input1, input2));
                    System.out.println("Bitwise of Right to Shift " + bitwise.RightShift(input1, input2));
                    System.out.println("Bitwise of Inversion " + bitwise.BitInversion(input1));
                break;
                /**
                 *
                 */
                case 4:
                    int optionMoney;
                    System.out.println("========================================");
                    System.out.println("Exchange Money Rail To Other ");
                    System.out.println("Exchange Money Other To Rail ");
                    System.out.println("================================================");

                    System.out.print("Please choice 1->2 ");
                    optionMoney = choice.nextInt();
                    System.out.println("================================================");
                    if (optionMoney == 1) {

                        int money_rail;
                        System.out.print("Enter Your Money <Rail> : ");
                        money_rail = choice.nextInt();

                        System.out.println("================================================");
                        System.out.println("Rate of Rail to Dolor " + moneyExchange.Rail2Dolor(money_rail));
                        System.out.println("Rate of Rail to Euro " + moneyExchange.Rail2Euro(money_rail));
                        System.out.println("Rate of Rail to Frank " + moneyExchange.Rail2Frank(money_rail));
                        System.out.println("Rate of Rail to pound " + moneyExchange.Rail2Pound(money_rail));
                        System.out.println("Rate of Rail to Bart " + moneyExchange.Rail2Bart(money_rail));
                        System.out.println("================================================");
                    } else if (optionMoney == 2) {
                        double money_other;
                        System.out.print("Please Enter Your <other money> : ");
                        money_other = choice.nextInt();
                        System.out.println("================================================");
                        System.out.println("Rate of Dolor to Rail " + moneyExchange.Dolor2Rail(money_other));
                        System.out.println("Rate of Euro to Rail " + moneyExchange.Euro2Rail(money_other));
                        System.out.println("Rate of Frank to Rail " + moneyExchange.Frank2Rail(money_other));
                        System.out.println("Rate of Pound to Rail " + moneyExchange.Pound2Rail(money_other));
                        System.out.println("Rate of Bart to Rail " + moneyExchange.Bart2Rail(money_other));
                        System.out.println("================================================");
                    } else
                        System.out.println("No Program!.............");
                        System.exit(6);
                break;
                default:
                    choice.close();
                    System.exit(10);

            }
        }


    }
}
