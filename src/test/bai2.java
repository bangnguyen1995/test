/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0] - arr[1];
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                int brand = arr[j] - arr[k];
                if (Math.abs(brand) < Math.abs(min)) {
                    min = brand;
                    System.out.println(arr[j] + " " + arr[k]);
                }

            }

        }

    }
}
