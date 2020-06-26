package com.company.Buble;

import java.util.Arrays;

public class SortCount {
    // Подсчитать количество операций в сортировках и сравнить с их О-большое
    // Реализовать сортировку подсчётом


    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,1,4,7,9};
        int length = array.length;
        int[] count = new int[10];
        int sum=0;

        for (int i = 0; i <length; i++) {

            if(array[i]==0) {
                count[0]+=1;
                if(count[0]==2){
                    count[0]=22;
                }
            }
            if(array[i]==1) {
                count[1]+=1;
                if(count[1]==3){
                    count[1]=333;
                }
            }
            if(array[i]==2) {
                count[2]+=1;
                if(count[2]==2){
                    count[2]=22;
                }
            }
            if(array[i]==3) {
                count[3]+=1;
                if(count[3]==2){
                    count[3]=22;
                }
            }

            if(array[i]==4) {
                count[4]+=1;
                if(count[4]==3){
                    count[4]=333;
                }
            }
            if(array[i]==5) {
                count[5]+=1;
                if(count[5]==2){
                    count[5]=22;
                }
            }
            if(array[i]==6) {
                count[6]+=1;
                if(count[6]==2){
                    count[6]=22;
                }
            }
            if(array[i]==7) {
                count[7]+=1;
                if(count[7]==3){
                    count[7]=333;
                }
            }

            if(array[i]==8) {
                count[8]+=1;
                if(count[8]==2){
                    count[8]=22;
                }
            }
            if(array[i]==9) {
                count[9]+=1;
                if(count[9]==3){
                    count[9]=333;
                }
            }

        }
        System.out.println(Arrays.toString(count));
    }



}
