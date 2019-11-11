package activityStarterCode.sortingArrays;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

        for (int i = 0, ai = 0, bi = 0; i < newLength; i++) {
            if (ai >= a.length) { return append(subarray(merged, 0, i), sort(subarray(b, bi, b.length))); }
            if (bi >= b.length) { return append(subarray(merged, 0, i), sort(subarray(a, ai, a.length))); }
            if (a[ai].compareTo(b[bi]) < 0) {
                merged[i] = a[ai];
                ai++;
            } else {
                merged[i] = b[bi];
                bi++;
            }
        }
        return merged;
    }

    public static String[] sort(String[] a) {
        if (a == null) { return null; }
        if (a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;

        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

    public static String[] append(String[] a, String[] b) {
        String[] appended = new String[a.length + b.length];
        for(int ai = 0; ai < a.length; ai++) {
            appended[ai] = a[ai];
        }
        for(int bi = 0; bi < b.length; bi++) {
            appended[bi + a.length] = b[bi];
        }
        return appended;
    }

    public static String[] subarray(String[] a, int starti, int endi) {
        String[] sub = new String[endi - starti];
        int subi = 0;
        for(int i = starti; i < endi; i++) {
            sub[subi] = a[i];
            subi++;
        }
        return sub;
    }
}
