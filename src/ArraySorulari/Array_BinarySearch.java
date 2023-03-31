package ArraySorulari;

import java.util.Arrays;

public class Array_BinarySearch {
    public static void main(String[] args) {

        int[] arr={2,8,3,6,1,9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 6, 8, 9]

        System.out.println(Arrays.binarySearch(arr, 2));  // 1 --> eger aradigi eleman varsa index no dönüyor
        System.out.println(Arrays.binarySearch(arr, 4));  // -4 --> eger aradigi eleman yoksa (-) sıra no dönüyor
        System.out.println(Arrays.binarySearch(arr, 14)); // -7
        System.out.println(Arrays.binarySearch(arr, 0));  // -1

    }
}
