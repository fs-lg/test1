
import java.util.Scanner;

public class Revers_Array {

    public static void main(String[] args) {

        int array[];
        int temp;
        int i, n;
        Scanner intput = new Scanner(System.in);
        System.out. println("How many number:");
        n = intput.nextInt();
        array = new int[n];
        for (i = 0; i < n; i++) {
            System.out. println("please enter numbers:");
            array[i] = intput.nextInt();
        }
//        for (i = 0; i < n; i++) {
//            System.out. print ("\t" + array[i]);
//        }
        System.out.println("");
        for (i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        for (i= 0; i < n; i++) {

            System.out. print ("\t" + array[i]);
        }
    }
}