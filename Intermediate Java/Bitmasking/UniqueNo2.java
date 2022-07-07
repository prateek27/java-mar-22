package com.prateek.javapractice;

public class UniqueNo2 {

    public static void main(String[] args) {
        int[] arr = {7,6,5,8,4,8,3,1,1,3,6,7};
        //step - 1
        int res = 0;
        for(int x:arr){
            res = res^x;
        }

        //step-2 pos of rightmost set bit
        int pos=0;
        while((res&1) !=1){
            res = res>>1;
            pos++;
        }

        //step-3 filter out no's which have set at bit given pos
        int A = 0;
        int B = 0;
        for(int x : arr){
            if ((x & (1<<pos)) > 0){
                A = A^x;
            }
            else{
                B = B^x;
            }
        }
        System.out.println(A);
        System.out.println(B);
    }

}
