package Car;

import Car.Car;
import Programm.Backend;
import Programm.Devops;
import Programm.Frontend;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("x");
        //Car tesla = new Tesla("y");

        /*boolean result = tesla instanceof Car;
        System.out.println(result);
        multiplication(2,3,5);
        multiplication(3,4,4,1.3);
        System.out.println(multiplication(2,1,9,3.9,5.2));*/


    }
     public static   void  multiplication(int a, int b, int c){
         System.out.println(a*b*c);
     }
    public static   void  multiplication(int a, int b){
        System.out.println(a*b);
    }
    public static   void  multiplication(int a, int b, int c, double d){
        System.out.println(a*b*c*d);
    }
    public static double  multiplication(int a, int b, int c, double d, double j){
        return a*b*c*d*j;
    }
}