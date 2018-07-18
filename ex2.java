import java.util.Arrays;
import java.util.Random;

public class ex2 {
    public static void main (String args []){
        int loto[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
                32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64};

        Random rnd = new Random();
        int randomArray = loto[rnd.nextInt(64)];
        int randomArray1 = loto[rnd.nextInt(64)];
        int randomArray2 = loto[rnd.nextInt(64)];
        int randomArray3 = loto[rnd.nextInt(64)];
        int randomArray4 = loto[rnd.nextInt(64)];
        int randomArray5 = loto[rnd.nextInt(64)];


        int[] arr = {randomArray, randomArray1, randomArray2, randomArray3, randomArray4, randomArray5,};
        boolean isSorted = false;
        int x;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
        }
        System.out.println("res : " + Arrays.toString(arr));
    }
}
