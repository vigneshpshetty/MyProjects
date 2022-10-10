//finding leader element in Array
package javaProblems;

class LeaderElement {
    public static void main(String[] args) {

        int a[] = { 10, 20, 15, 35, 25, 18, 30 };

        int max = a[a.length - 1];
        System.out.println(max);

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}