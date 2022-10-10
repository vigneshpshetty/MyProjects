package javaProblems;

public class FindLonelyElement {
    public static void main(String[] args) {

        int a[] = { 1, 2, 8, 3, 1, 2, 8 };
        int res = a[0];
        int n =  a.length;
        for (int i = 1; i < n; i++) {
            res = res ^ a[i];
        }

        System.out.println(res);
    }
}
