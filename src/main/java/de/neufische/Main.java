package de.neufische;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main<string> {
    public static void main(String[] args) {







        }

    public static String fizzbuzz( int Zahl){




        if ( Zahl % 3 == 0) {
            return "Fizz";
        }else if( Zahl % 5 == 0) {
            return "Buzz";

        }else if (Zahl % 5 == 0 && Zahl % 3 ==0 ){
            return "FizzBuzz";

        }

        return String.valueOf(Zahl);



    }
    public static boolean smallerThanZero( int Zahl){
        if ( Zahl >= 0) {
            return true;
        }else return false;
    }

    public static boolean sumSquaeOrSubstract( int Zahl1, int Zahl2){
        if ( Zahl1 >Zahl2 ) {
            return Zahl1+Zahl2;
        }else if return Zahl1*Zahl2;
    }


}