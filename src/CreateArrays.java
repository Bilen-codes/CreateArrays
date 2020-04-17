/*
*1, Declare 5 numbers , 7 string, 5 characters and 2 booleans.
*2, Initalize all the data types to appropriate data.
*3, using Array.toString() print all types of the arrays
* */
import java.util.Arrays;
public class CreateArrays {
    public static void main(String [] args){
        int num [] = {1,21,63,4,51};
        String str [] = {"hello", "CS", "is", "awsome", "so", "is", "CS"};
        Character ch [] = {'s', 'd', '-', '9', 'w'};
        boolean [] bn = {true, false};
        //print

            System.out.println("Numbers:"+ Arrays.toString(num));
            System.out.println("Strings:" + Arrays.toString(str));
            System.out.println("Characters:" +Arrays.toString(ch));
            System.out.println("Booleans:" + Arrays.toString(bn));



    }
}
