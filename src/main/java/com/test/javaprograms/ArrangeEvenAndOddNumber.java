package javaprograms;

import java.util.Arrays;

public class ArrangeEvenAndOddNumber {

    public static void main(String[] args) {
        int arr[] = {2, 9, 3, 5, 4, 7, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while(arr[left]%2 == 0){
                left ++;
            }
            while(arr[right]%2 !=0){
                right --;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
