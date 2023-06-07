package baiTapTrenLop;

import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 4};
        int[] Arr2 = {5, 6, 7, 8};
        int[] Arr3 = new int[Arr1.length + Arr2.length];
        for (int i = 0; i < Arr3.length; i++) {
            if (i < Arr1.length) {
                Arr3[i] = Arr1[i];
            } else {
                Arr3[i] = Arr2[i - Arr1.length];
            }

        }
        System.out.println("mang sau khi duoc  gop la: " + Arrays.toString(Arr3));

    }
}
