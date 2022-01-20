package com.bridgelabz;
import java.util.*;

public class InsertionSort {

    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[])
    {
        System.out.println("How many number you want to sort ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the numbers which you want to sort ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
    }
}
