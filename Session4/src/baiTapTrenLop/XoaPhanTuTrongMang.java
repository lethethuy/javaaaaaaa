package baiTapTrenLop;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap phan tu muon xoa: ");
        int number = Integer.parseInt(sc.nextLine());

        int index_del = -1;

        for (int i = 0; i < arr1.length; i++) {
           if(number==arr1[i]){
               index_del = i;
               break;
           }
        }

        if(index_del== -1){
            System.out.println("trong mang nay khong co so nay");
        }else {

        }
    }
}
