package arraysSortExamples;

import java.util.Arrays;

public class ArrayLeftRotate {
    static int[] rotLeft(int[] a, int d) {

        for(int j = 0; j<d; j++){
            int temp = a[0];
            for(int i = 0 ; i < a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int res[] = rotLeft(new int[]{1,2,3,4,5}, 2);
        System.out.println(Arrays.toString(res));
    }
}
