package com.dmdev;

import java.util.Scanner;

public class taskn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int kk = 0;
        int arr[][] = new int[n][n];

        for (int i = 0 ; i < x; i++){
            for (int j = 0 ; j < y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < x; i++){
            int k = 0;
            for (int j = 0 ; j < y; j++) {
                if (vozr(arr[i][j])) {
                    k++;
                }
            }
            if (k==2) kk++;

        }

        if (kk == x) System.out.println("ВСЕЕЕ збс");
        else System.out.println("эээ ниче не збс");

        for (int i = 0 ; i < x; i++){
            for (int j = 0 ; j < y; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }









    }
    public static boolean vozr(int x){
        int pr = 10;
        while (x>0){
            if (x%10 < pr){
                pr = x%10;
            }else{ return false;}
        x/=10;
        }
        return true;
}
}
