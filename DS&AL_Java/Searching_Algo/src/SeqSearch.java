import javax.sound.midi.SysexMessage;
import java.util.Scanner;


// 요소가 직선 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색하면 되는데, 이를 선형 검색 또는 순차 검색이라고 한다.

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {
//        int i = 0;
//        while (true) {
//            if (i == n)
//                return -1;
//            if (a[i] == key)
//                return i;
//            i++;
//        }
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}
