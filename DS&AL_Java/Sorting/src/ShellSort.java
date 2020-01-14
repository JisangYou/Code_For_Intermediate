import java.util.Scanner;


/**
 * 셸 정렬은 단순 삽입 정렬의 장점을 살리고 단점은 보완하여 좀 더 빠르게 정렬하는 알고리즘입니다.
 */

public class ShellSort {
//    버전 1
//    static void shellSort(int[] a, int n) {
//        for (int h = n / 2; h > 0; h /= 2)
//            for (int i = h; i < n; i++) {
//                int j;
//                int tmp = a[i];
//                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
//                    a[j + h] = a[j];
//                a[j + h] = tmp;
//            }
//    }

//    버전 2
    static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1) ;

        for (; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }


    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1)");
        System.out.println("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

}
