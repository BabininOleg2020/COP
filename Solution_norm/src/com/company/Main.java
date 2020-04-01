package com.company;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    /*
    Дано: n - количество чисел в массиве
    *ar - массив чисел
    * 0 < n < 100
    *-100 <= ar[i] <= 100
    *   вычислить нормализованное количество положительных, отрицательных и нулевых элементов
    * Пример:
    *6
    *-4 3 -9 0 4 1
    *
    *Output
    *0.500000
    *0.333333
    *0.166667
     */
    static void func1(int[] arr) {
        int len = arr.length;
        float pos = 0,neg = 0 ,zero = 0 ;
        for (int i= 0; i<len; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println(pos/len);
        System.out.println(neg/len);
        System.out.println(zero/len);
    }

    public static void main(String[] args) {
        System.out.println("Enter kol-vo n:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        System.out.println("Enter element mass:");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("Press Enter");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        func1(arr);

        scanner.close();
    }



}