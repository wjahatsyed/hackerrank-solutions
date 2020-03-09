package com.wajahat.hackerrank.ipk;

/**
 * Created by Syed Wajahat on 3/6/2020.
 * A left rotation operation on an array shifts each of the array's elements 1 unit
 * unit to the left. For example, if 2 eft rotations are performed on array [1,2,3,4,5] then
 * the array would become [3,4,5,1,2].
 * Given an array a of n integers and a number, d, perform d left rotations on the array. Return
 * the updated array to be printed as a single line of space-separated integers.
 */
public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rotLeft(a, 4);
    }

    static int[] rotLeft(int[] a, int d) {
        while (d > 0) {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            d--;
        }
        return a;
    }
}
