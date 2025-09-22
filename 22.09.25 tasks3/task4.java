package com.dmdev.lesson5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int cotr = 0;
        for (int i = 0; i < n ; i++){
            arr[i] = scan.nextInt();
            if ( arr[i] < 0){
                cotr++;
            }
        }
        if (cotr >= 2){
            System.out.println("ОТРИЦАТЕЛЬНЫХ больше или равно 2");
        }
        else {
            System.out.println("ОТРИЦАтельных меньше 2");
        }


}
}

